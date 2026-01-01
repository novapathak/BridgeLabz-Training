package com.bridgelabz.encapsulation;

public class NonVegItem extends FoodItem implements Discountable {

    private static final double EXTRA_CHARGE = 50;

    public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + EXTRA_CHARGE;
    }

    @Override
    public double applyDiscount() {
        // 5% discount for non-veg items
        return calculateTotalPrice() * 0.05;
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }
}
