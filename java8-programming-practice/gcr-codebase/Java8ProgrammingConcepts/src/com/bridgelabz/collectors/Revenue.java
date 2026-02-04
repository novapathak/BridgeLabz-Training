package com.bridgelabz.collectors;

import java.util.*;
import java.util.stream.*;

class Order {
    String customer;
    double amount;

    Order(String customer, double amount) {
        this.customer = customer;
        this.amount = amount;
    }
}

public class Revenue {
    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
            new Order("Nova", 500),
            new Order("Adarsh", 300),
            new Order("Nova", 700)
        );

        Map<String, Double> revenueByCustomer =
            orders.stream()
                  .collect(Collectors.groupingBy(
                      o -> o.customer,
                      Collectors.summingDouble(o -> o.amount)
                  ));

        revenueByCustomer.forEach((customer, total) ->
            System.out.println(customer + " Total: " + total)
        );
    }
}
