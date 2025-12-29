package com.bridgelabz.oops.levelone;

public class Item {

    // Item details arrays
    String[] itemCode;
    String[] itemName;
    double[] price;

    // Constructor
    Item(String[] itemCode, String[] itemName, double[] price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Method to display item details
    void displayItem(int index) {
        System.out.println("Item Code: " + itemCode[index]);
        System.out.println("Item Name: " + itemName[index]);
        System.out.println("Price: " + price[index]);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        String[] codes = {"01AA", "01BB", "02AA"};
        String[] names = {"Water Bottle", "Rice", "Blackboard"};
        double[] prices = {500, 700, 400};

        Item item = new Item(codes, names, prices);

        for (int i = 0; i < prices.length; i++) {
            item.displayItem(i);
        }
    }
}
