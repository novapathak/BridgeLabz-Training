package com.bridgelabz.day06.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 80);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 2;
        double penalty = hours > allowedHours ? (hours - allowedHours) * 50 : 0;
        return (baseRate * hours) + penalty;
    }
}
