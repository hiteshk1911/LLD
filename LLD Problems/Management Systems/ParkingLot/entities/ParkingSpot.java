class ParkingSpot {
    private String spotId;
    private boolean isOccupied;
    private Vehicle parkedVehicle;
    private VehicleSize spotSize;

    ParkingSpot(String spotId, VehicleSize spotSize) {
        this.spotId = spotId;
        this.spotSize = spotSize;
        this.isOccupied = false;
        this.parkedVehicle = null;
    }

    public String getSpotId() {
        return spotId;
    }

    public VehicleSize getSpotSize() {
        return spotSize;
    }

    public synchronized boolean isAvailable() {
        return !isOccupied;
    }

    public boolean isOccupied {
        return isOccupied;
    }

    public synchronized void parkVehicle(Vehicle vehicle){
        if (isOccupied) {
            throw new IllegalStateException("Parking spot is already occupied.");
        }
        if (vehicle.getSize().ordinal() > spotSize.ordinal()) {
            throw new IllegalArgumentException("Vehicle size exceeds parking spot size.");
        }
        this.parkedVehicle = vehicle;
        this.isOccupied = true;
    }

    public synchronized void unparkVehicle() {
        if (!isOccupied) {
            throw new IllegalStateException("Parking spot is already empty.");
        }
        this.parkedVehicle = null;
        this.isOccupied = false;
    }

    public boolean canFitVehicle(Vehicle vehicle) {
        if(vehicle == null || isOccupied) {
            return false;
        }

        switch(vehicle.getSize()) {
            case SMALL:
                return spotSize == VehicleSize.SMALL ;
            case MEDIUM:
                return spotSize == VehicleSize.MEDIUM || spotSize == VehicleSize.LARGE;
            case LARGE:
                return spotSize == VehicleSize.LARGE;
            default:
                return false;
        }
    }

}