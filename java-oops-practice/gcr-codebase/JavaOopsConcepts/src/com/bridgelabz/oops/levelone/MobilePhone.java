package com.bridgelabz.oops.levelone;

public class MobilePhone {

    // Mobile details
    String brand;
    String model;
    double price;

    // Constructor
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display mobile details
    void displayMobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        MobilePhone m1 = new MobilePhone("VIVO", "V29", 15999);
        MobilePhone m2 = new MobilePhone("ONE PLUS", "Nord 4", 39999);
        MobilePhone m3 = new MobilePhone("APPLE", "iPhone 16 Pro", 79999);

        m1.displayMobile();
        m2.displayMobile();
        m3.displayMobile();
    }
}
