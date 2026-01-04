package com.bridgelabz.linkedlist.inventory;

public class InventoryMain {
    public static void main(String[] args) {
        InventoryList list = new InventoryList();

        list.addItem(1, "Pen", 10, 5);
        list.addItem(2, "Book", 3, 100);

        System.out.println("Total Value: " + list.totalValue());
    }
}
