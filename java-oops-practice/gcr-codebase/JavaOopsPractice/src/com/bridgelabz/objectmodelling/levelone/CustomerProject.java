package com.bridgelabz.objectmodelling.levelone;

public class CustomerProject {
    private String name;

    public CustomerProject(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order");
        order.showOrder();
    }
}
