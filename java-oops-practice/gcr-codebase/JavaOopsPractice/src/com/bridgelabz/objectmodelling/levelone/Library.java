package com.bridgelabz.objectmodelling.levelone;
import java.util.ArrayList;

public class Library {

    private String libraryName;

    // Library HAS-A list of Books (Aggregation)
    private ArrayList<Book> books;

    // Constructor
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // Add book to library
    public void addBook(Book book) {
        books.add(book);
    }

    // Display all books in library
    public void showBooks() {
        System.out.println("\nBooks in " + libraryName + ":");
        for (Book book : books) {
            book.displayBook();
        }
    }
}
