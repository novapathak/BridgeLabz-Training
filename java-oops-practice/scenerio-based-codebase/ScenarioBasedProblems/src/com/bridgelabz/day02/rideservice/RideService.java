package com.bridgelabz.day02.rideservice;

class RideService implements IRideService {
    private Vehicle vehicle;
    private Driver driver;
    private double fare; // hidden from outside

    private final double baseFare = 50;

    RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(int distance) {
        fare = baseFare + distance * vehicle.ratePerKm;
        System.out.println("Ride booked with " + vehicle.getType());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended. Total Fare: ₹" + fare);
    }
}

