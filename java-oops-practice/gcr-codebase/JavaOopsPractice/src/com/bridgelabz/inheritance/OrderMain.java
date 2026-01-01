package com.bridgelabz.inheritance;

public class OrderMain {

    public static void main(String[] args) {

        Order order1 = new Order(101, "2025-01-01");
        Order order2 = new ShippedOrder(102, "2025-01-02", "TRK12345");
        Order order3 = new DeliveredOrder(103, "2025-01-03", "TRK67890", "2025-01-06");

        System.out.println(order1.getOrderStatus());
        System.out.println(order2.getOrderStatus());
        System.out.println(order3.getOrderStatus());
    }
}
