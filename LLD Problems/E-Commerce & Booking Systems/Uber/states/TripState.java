interface TripState {
    void request(Trip trip);
    void assign(Trip trip, Driver driver);
    void start(Trip trip);
    void end(Trip trip);
}
