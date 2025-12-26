package com.bridgelabz.oops.leveltwo;

public class CartItem {

    String itemName;
    double price;
    int quantity;

    // Constructor
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Add items
    void addItem(int qty) {
        quantity += qty;
    }

    // Remove items
    void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
        else
            System.out.println("Not enough items to remove");
    }

    // Calculate total cost
    double totalCost() {
        return price * quantity;
    }

    public static void main(String[] args) {
        CartItem item = new CartItem("Laptop", 999.99, 1);

        item.addItem(2);
        item.removeItem(1);

        System.out.println("Total Cost: " + item.totalCost());
    }
}
