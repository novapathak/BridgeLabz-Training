package com.bridgrlabz.oops.levelone;

public class Book {

    // Book details
    String title;
    String author;
    double price;

    // Constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    void displayBook() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Book book1 = new Book("2 States", "Chetan Bhagat", 500);
        Book book2 = new Book("Wings of Fire", "A. P. J. Abdul Kalam", 500);

        book1.displayBook();
        book2.displayBook();
    }
}
