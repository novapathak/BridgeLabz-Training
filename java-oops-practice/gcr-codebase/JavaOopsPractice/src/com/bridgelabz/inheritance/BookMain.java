package com.bridgelabz.inheritance;

public class BookMain {

    public static void main(String[] args) {

        Book book = new Author("Java Programming",2023,"James Gosling","Father of the Java Programming Language"
        );

        book.displayInfo(); // Polymorphism
    }
}
