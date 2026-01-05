package com.bridgelabz.day02.rideservice;

public class CabbyGoMain {
    public static void main(String[] args) {

        Vehicle vehicle = new Sedan("KA01AB1234");
        Driver driver = new Driver("Amit", "LIC123", 4.8);

        IRideService ride = new RideService(vehicle, driver);

        ride.bookRide(10);
        ride.endRide();
    }
}
