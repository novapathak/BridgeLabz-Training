package com.bridgelabz.day01.vehiclerental;

class Car extends Vehicle implements Rentable {

    Car(String number) {
        super(number, 1000);
    }

    public double calculateRent(int days) {
        return baseRate * days + 200; // extra charge
    }
}
