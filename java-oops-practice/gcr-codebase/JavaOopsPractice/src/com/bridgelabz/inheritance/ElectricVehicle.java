package com.bridgelabz.inheritance;

public class ElectricVehicle extends VehicleV {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println(model + " is charging.");
    }
}
