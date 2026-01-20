package com.bridgelabz.dsa.day06.fleetmanager;

public class FleetManagerTest {
    public static void main(String[] args) {

        Vehicle[] vehicles = {new Vehicle(45000),
        		new Vehicle(20000),
            new Vehicle(60000),
            new Vehicle(30000)
        };

        FleetManager fm = new FleetManager();
        System.out.println("Before Sorting:");
        fm.display(vehicles);
        fm.mergeSort(vehicles, 0, vehicles.length - 1);
        System.out.println("After Sorting:");
        fm.display(vehicles);
    }
}
