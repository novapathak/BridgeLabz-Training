package com.bridgelabz.keyword;

public class Library {

    public static void main(String[] args) {

        // Set static library name
        Book.setLibraryName("Egmore Library");

        // Display library name
        Book.displayLibraryName();

        // Create Book object
        Book book1 = new Book("Effective Java","Joshua Bloch","978-0134685991");

        // Display book details
        book1.displayBookDetails();
    }
}
