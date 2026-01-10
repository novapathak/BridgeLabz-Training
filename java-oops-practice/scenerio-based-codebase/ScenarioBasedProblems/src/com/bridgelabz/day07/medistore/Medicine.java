package com.bridgelabz.day07.medistore;

import java.time.LocalDate;

public abstract class Medicine implements ISellable {

    private String name;
    private double price;
     LocalDate expiryDate;
    private int quantity;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 100); // default stock
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Encapsulation: stock update hidden
    protected void reduceStock(int soldQty) {
        this.quantity -= soldQty;
    }

    protected boolean isExpired() {
        return LocalDate.now().isAfter(expiryDate);
    }

    // Private pricing logic (Sensitive)
    private double applyDiscount(double total) {
        return total > 500 ? total * 0.90 : total; // 10% discount
    }

    @Override
    public double sell(int qty) {
        if (qty > quantity || checkExpiry()) {
            System.out.println("Sale not allowed!");
            return 0;
        }
        double total = price * qty; // Operator *
        total = applyDiscount(total);
        reduceStock(qty);           // Operator -
        return total;
    }

    public String getName() {
        return name;
    }
}
