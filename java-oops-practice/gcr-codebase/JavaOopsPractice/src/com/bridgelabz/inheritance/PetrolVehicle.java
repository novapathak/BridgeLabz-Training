package com.bridgelabz.inheritance;

public class PetrolVehicle extends VehicleV implements Refuelable {

    public PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    @Override
    public void refuel() {
        System.out.println(model + " is refueling petrol.");
    }
}
