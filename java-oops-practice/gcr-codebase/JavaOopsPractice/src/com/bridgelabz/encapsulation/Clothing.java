package com.bridgelabz.encapsulation;

public class Clothing extends Product implements Taxable {

    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    // 20% discount
    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }

    // 12% GST
    @Override
    public double calculateTax() {
        return price * 0.12;
    }

    @Override
    public String getTaxDetails() {
        return "12% GST on Clothing";
    }
}
