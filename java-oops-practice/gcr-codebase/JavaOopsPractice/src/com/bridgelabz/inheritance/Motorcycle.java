package com.bridgelabz.inheritance;

public class Motorcycle extends Vehicle {

    private boolean hasGear;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("\n--- Motorcycle Details ---");
        super.displayInfo();
        System.out.println("Has Gear : " + hasGear);
    }
}
