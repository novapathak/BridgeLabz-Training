package com.bridgelabz.day08.foodloop;

public class FoodLoopTest {
    public static void main(String[] args) {
        FoodItem pizza = new VegItem("Pizza", 300, 10);
        FoodItem chicken = new NonVegItem("Chicken Burger", 250, 5);

        Order order = new Order(pizza, chicken);
        order.placeOrder();
    }
}
