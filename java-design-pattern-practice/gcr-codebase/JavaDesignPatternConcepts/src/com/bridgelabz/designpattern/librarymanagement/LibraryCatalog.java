package com.bridgelabz.designpattern.librarymanagement;

import java.util.*;

public class LibraryCatalog {

    private static LibraryCatalog instance;
    private Map<String, Book> books = new HashMap<>();

    private LibraryCatalog() {}

    public static LibraryCatalog getInstance() {
        if (instance == null) {
            instance = new LibraryCatalog();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.put(book.getTitle(), book);
        System.out.println("Book added to catalog: " + book.getTitle());
    }

    public Book getBook(String title) {
        return books.get(title);
    }
}
