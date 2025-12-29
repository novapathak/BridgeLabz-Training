package com.bridgelabz.constructor;
class CarRental {

    String customerName, carModel;
    int rentalDays;
    double costPerDay = 1000;

    // constructor
    CarRental(String c, String m, int d) {
        customerName = c;
        carModel = m;
        rentalDays = d;
    }

    // method to calculate total cost
    double calculateTotalCost() {
        return rentalDays * costPerDay;
    }

    public static void main(String[] args) {
        CarRental r = new CarRental("Amit", "Swift", 3);
        System.out.println("Total Cost: " + r.calculateTotalCost());
    }
}

