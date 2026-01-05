package com.bridgelabz.day02.rideservice;

class Vehicle {
    protected String vehicleNumber;
    protected int capacity;
    protected String type;
    protected double ratePerKm;

    Vehicle(String vehicleNumber, int capacity, String type, double ratePerKm) {
        this.vehicleNumber = vehicleNumber;
        this.capacity = capacity;
        this.type = type;
        this.ratePerKm = ratePerKm;
    }

    public String getType() {
        return type;
    }
}
