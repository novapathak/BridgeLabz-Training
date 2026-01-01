package com.bridgelabz.encapsulation;

public abstract class Vehicle {

    // Encapsulated fields
    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Getters & Setters (Encapsulation)
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        if (!vehicleNumber.isEmpty()) {
            this.vehicleNumber = vehicleNumber;
        }
    }

    public String getType() {
        return type;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayVehicleDetails() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + type);
        System.out.println("Rental Rate    : ₹" + rentalRate + " per day");
    }
}
