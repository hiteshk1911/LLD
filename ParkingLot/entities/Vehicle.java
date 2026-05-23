abstract class Vehicle {
    private final String licenseNumber;
    private final VehicleSize size;

    public Vehicle(String licenseNumber, VehicleSize size) {
        this.licenseNumber = licenseNumber;
        this.size = size;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public VehicleSize getSize() {
        return size;
    }
}

class Bike extends Vehicle {
    public Bike(String licenseNumber) {
        super(licenseNumber, VehicleSize.SMALL);
    }
}

class Car extends Vehicle {
    public Car(String licenseNumber) {
        super(licenseNumber, VehicleSize.MEDIUM);
    }
}

class Truck extends Vehicle {
    public Truck(String licenseNumber) {
        super(licenseNumber, VehicleSize.LARGE);
    }
}

