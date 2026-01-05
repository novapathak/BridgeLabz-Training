package com.bridgelabz.day01.vehiclerental;

public class VehicleMain {
    public static void main(String[] args) {
        Rentable v1 = new Car("KA01");
        Rentable v2 = new Bike("KA02");

        System.out.println(v1.calculateRent(3));
        System.out.println(v2.calculateRent(3));
    }
}
