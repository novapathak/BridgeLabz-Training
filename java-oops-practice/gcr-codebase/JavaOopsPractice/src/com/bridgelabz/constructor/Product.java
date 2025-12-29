package com.bridgelabz.constructor;
class Product {

    // instance variables (different for each product)
    String productName;
    double price;

    // class variable (same for all products)
    static int totalProducts = 0;

    // constructor to initialize values
    Product(String name, double p) {
        productName = name;
        price = p;
        totalProducts++; // increase count when object is created
    }

    // instance method to show product details
    void displayProductDetails() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }

    // class method to show total products
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Mobile", 12000);
        Product p2 = new Product("Laptop", 50000);

        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}
