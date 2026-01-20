package com.bridgelabz.dsa.day06.icecreamcrush;

public class Main {
    public static void main(String[] args) {

        Flavor[] flavors = {
            new Flavor("Nova", 120),
            new Flavor("Pathak", 200),
            new Flavor("Adarsh", 90),
            new Flavor("Pathak", 150)
        };

        IceCreamRush shop = new IceCreamRush();
        shop.bubbleSort(flavors);
        System.out.println("\nAfter Sorting:");
        shop.display(flavors);
    }
}
