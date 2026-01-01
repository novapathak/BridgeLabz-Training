package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class ProductMain {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();

        products.add(new Electronics(101, "Laptop", 60000));
        products.add(new Clothing(102, "Jacket", 3000));
        products.add(new Groceries(103, "Rice Bag", 1200));

        calculateFinalPrice(products);
    }

    // Polymorphism using Product reference
    public static void calculateFinalPrice(List<Product> products) {

        for (Product p : products) {

            p.displayProduct();

            double tax = 0;
            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println("Tax Info   : " + t.getTaxDetails());
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("Discount   : ₹" + discount);
            System.out.println("Final Price: ₹" + finalPrice);
            System.out.println("-----------------------------");
        }
    }
}
