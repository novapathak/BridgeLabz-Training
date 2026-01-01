package com.bridgelabz.inheritance;

public class VehicleVMain {

    public static void main(String[] args) {

        VehicleV v1 = new ElectricVehicle(150, "Tesla");
        VehicleV v2 = new PetrolVehicle(180, "Honda City");
        ((ElectricVehicle) v1).charge();
        ((PetrolVehicle) v2).refuel();
    }
}
