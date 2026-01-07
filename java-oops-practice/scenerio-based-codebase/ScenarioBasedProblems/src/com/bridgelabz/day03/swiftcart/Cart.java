package com.bridgelabz.day03.swiftcart;

import java.util.ArrayList;

public class Cart implements ICheckout {
    private ArrayList<Product> products;
    private double totalPrice;

    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    public void addProduct(Product product, int quantity) {
        products.add(product);
        totalPrice += product.price * quantity; // Operator usage
    }

    private void calculateTotal() {
        for (Product p : products) {
            totalPrice += p.price;
        }
    }

    @Override
    public void applyDiscount() {
        double discount = 0;
        for (Product p : products) {
            discount += p.applyDiscount(totalPrice);
        }
        totalPrice -= discount;
    }

    @Override
    public void generateBill() {
        applyDiscount();
        System.out.println("Final Bill Amount: ₹" + totalPrice);
    }
}
