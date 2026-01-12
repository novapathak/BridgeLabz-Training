package com.bridgelabz.day08.foodloop;

class FoodItem {
    private String name;
    protected double price;
    private int stock;

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0;
    }
}
