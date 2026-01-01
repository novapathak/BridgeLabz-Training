package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class VehicleMain {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 2000, "CAR-INS-01"));
        vehicles.add(new Bike("BIKE202", 500, "BIKE-INS-02"));
        vehicles.add(new Truck("TRUCK303", 4000, "TRUCK-INS-03"));

        calculateCosts(vehicles, 3); // 3 rental days
    }

    // Polymorphism using Vehicle reference
    public static void calculateCosts(List<Vehicle> vehicles, int days) {

        for (Vehicle v : vehicles) {

            v.displayVehicleDetails();

            double rentalCost = v.calculateRentalCost(days);
            System.out.println("Rental Cost (" + days + " days): ₹" + rentalCost);

            if (v instanceof Insurable) {
                Insurable i = (Insurable) v;
                System.out.println(i.getInsuranceDetails());
                System.out.println("Insurance Cost: ₹" + i.calculateInsurance());
            }

            System.out.println("--------------------------------");
        }
    }
}
