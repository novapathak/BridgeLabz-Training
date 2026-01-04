package com.bridgelabz.linkedlist.inventory;

class InventoryList {
    InventoryNode head;

    void addItem(int id, String name, int qty, double price) {
        InventoryNode node = new InventoryNode(id, name, qty, price);
        node.next = head;
        head = node;
    }

    double totalValue() {
        double sum = 0;
        InventoryNode temp = head;
        while (temp != null) {
            sum += temp.quantity * temp.price;
            temp = temp.next;
        }
        return sum;
    }
}
