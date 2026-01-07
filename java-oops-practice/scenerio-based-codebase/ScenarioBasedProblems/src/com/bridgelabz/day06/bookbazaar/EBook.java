package com.bridgelabz.day06.bookbazaar;

public class EBook extends Book {

    public EBook(String title, String author, double price) {
        super(title, author, price, Integer.MAX_VALUE);
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.20; // 20% discount
    }
}

