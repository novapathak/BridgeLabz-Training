package com.bridgelabz.day06.bookbazaar;

public class Order {
    private String user;
    private Book book;
    private int quantity;

    private String status; // restricted

    public Order(String user, Book book, int quantity) {
        this.user = user;
        this.book = book;
        this.quantity = quantity;
        this.status = "CREATED";
    }

    public double calculateTotal() {
        if (book.reduceStock(quantity)) {
            double total = book.getPrice() * quantity;
            double discount = book.applyDiscount(total);
            status = "CONFIRMED";
            return total - discount;
        }
        status = "FAILED";
        return 0;
    }
}
