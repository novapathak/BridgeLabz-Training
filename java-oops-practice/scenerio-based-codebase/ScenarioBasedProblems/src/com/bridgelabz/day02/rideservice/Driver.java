package com.bridgelabz.day02.rideservice;

class Driver {
    private String name;
    private String licenseNumber;
    private double rating; // sensitive data

    Driver(String name, String licenseNumber, double rating) {
        this.name = name;
        this.licenseNumber = licenseNumber;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
}
