package com.bridgelabz.dsa.day04.smartshelf;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book("Java Basics"),
            new Book("Algorithms"),
            new Book("Data Structures"),
            new Book("Operating Systems")
        };

        SmartShelf shelf = new SmartShelf();
        System.out.println("Before Sorting:");
        shelf.display(books);
        shelf.insertionSort(books);
        System.out.println("\nAfter Alphabetical Sorting:");
        shelf.display(books);
    }
}
