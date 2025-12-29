package com.bridgelabz.constructor;
class Vehicle {

    // instance variables
    String ownerName;
    String vehicleType;

    // class variable
    static double registrationFee = 5000;

    // constructor
    Vehicle(String o, String v) {
        ownerName = o;
        vehicleType = v;
    }

    // instance method
    void displayVehicleDetails() {
        System.out.println(ownerName + " " + vehicleType + " Fee: " + registrationFee);
    }

    // class method to update fee
    static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Amit", "Car");
        v1.displayVehicleDetails();
        Vehicle.updateRegistrationFee(7000);
        v1.displayVehicleDetails();
    }
}
