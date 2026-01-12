package com.bridgelabz.day08.foodloop;

import java.util.ArrayList;

class Order implements IOrderable {
    private ArrayList<FoodItem> items = new ArrayList<>();
    private double total;

    public Order(FoodItem... foodItems) {
        for (FoodItem item : foodItems) {
            items.add(item);
            total += item.getPrice();
        }
    }

    public double applyDiscount() {
        if (total > 500)
            return total * 0.9; // 10% discount
        return total;
    }

    @Override
    public void placeOrder() {
        System.out.println("Order placed. Final Amount: " + applyDiscount());
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order cancelled.");
    }
}
