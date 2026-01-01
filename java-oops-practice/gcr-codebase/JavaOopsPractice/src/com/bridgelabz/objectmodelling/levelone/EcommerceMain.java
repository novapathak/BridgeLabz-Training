package com.bridgelabz.objectmodelling.levelone;

public class EcommerceMain {
    public static void main(String[] args) {

        Product p1 = new Product("Mobile", 15000);
        Product p2 = new Product("Headphones", 2000);

        Order order = new Order();
        order.addProduct(p1);
        order.addProduct(p2);

        CustomerProject c1 = new CustomerProject("Rahul");
        c1.placeOrder(order);
    }
}
