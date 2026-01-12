package com.bridgelabz.dsa.day01.bookshelf;

public class Book {
    private String title;
    private String author;
    protected String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public String getIsbn() {
        return isbn;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}