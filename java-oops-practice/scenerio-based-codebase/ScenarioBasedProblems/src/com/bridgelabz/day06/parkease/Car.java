package com.bridgelabz.day06.parkease;

public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, 50);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 3;
        double penalty = hours > allowedHours ? (hours - allowedHours) * 20 : 0;
        return (baseRate * hours) + penalty;
    }
}
