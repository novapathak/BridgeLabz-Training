package com.bridgelabz.encapsulation;

public class Electronics extends Product implements Taxable {

    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    // 10% discount
    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }

    // 18% GST
    @Override
    public double calculateTax() {
        return price * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% GST on Electronics";
    }
}
