package com.bridgelabz.inheritance;

public class Truck extends Vehicle {

    private double loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- Truck Details ---");
        super.displayInfo();
        System.out.println("Load Capacity : " + loadCapacity + " tons");
    }
}
