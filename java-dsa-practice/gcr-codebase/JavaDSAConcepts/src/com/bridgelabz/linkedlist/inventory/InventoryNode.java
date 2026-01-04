package com.bridgelabz.linkedlist.inventory;

class InventoryNode {
    int id, quantity;
    String name;
    double price;
    InventoryNode next;

    InventoryNode(int id, String name, int quantity, double price) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
}
