package com.bridgelabz.day06.bookbazaar;

public class PrintedBook extends Book {

    public PrintedBook(String title, String author, double price, int stock) {
        super(title, author, price, stock);
    }

    @Override
    public double applyDiscount(double total) {
        return total * 0.10; // 10% discount
    }
}

