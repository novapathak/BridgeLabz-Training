package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public void showOrder() {
        System.out.println("Order Details:");
        for (Product p : products) {
            System.out.println(p.name + " - ₹" + p.price);
        }
    }
}
