package com.bridgelabz.keyword;

public class Book {

    // Static variable (shared by all books)
    private static String libraryName;

    // Instance variables
    private String title;
    private String author;
    private final String isbn; // cannot be changed

    // Constructor
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Static method to set library name
    public static void setLibraryName(String name) {
        libraryName = name;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Getters (optional but good practice)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }
}
