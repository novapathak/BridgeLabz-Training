package com.bridgelabz.day01.vehiclerental;

class Bike extends Vehicle implements Rentable {

    Bike(String number) {
        super(number, 300);
    }

    public double calculateRent(int days) {
        return baseRate * days;
    }
}
