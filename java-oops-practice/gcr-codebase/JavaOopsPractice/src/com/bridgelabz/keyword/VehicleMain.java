package com.bridgelabz.keyword;

public class VehicleMain {

    public static void main(String[] args) {

        Vehicle.updateRegistrationFee(150.0);

        Vehicle v1 = new Vehicle("Honest raj", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Price danish", "SUV", "XYZ789");

        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
    }
}
