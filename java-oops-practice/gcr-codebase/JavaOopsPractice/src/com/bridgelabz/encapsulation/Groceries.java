package com.bridgelabz.encapsulation;

public class Groceries extends Product {

    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    // 5% discount
    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}
