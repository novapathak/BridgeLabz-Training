package com.bridgelabz.designpattern.librarymanagement;

import java.util.List;

public class Book {

    private String title;
    private List<String> authors;
    private String edition;
    private String genre;
    private String publisher;

    private Book(BookBuilder builder) {
        this.title = builder.title;
        this.authors = builder.authors;
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.publisher = builder.publisher;
    }

    public String getTitle() {
        return title;
    }

    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Authors: " + authors);
        System.out.println("Edition: " + edition);
        System.out.println("Genre: " + genre);
        System.out.println("Publisher: " + publisher);
        System.out.println("-----------------------");
    }

    public static class BookBuilder {

        private String title;
        private List<String> authors;
        private String edition;
        private String genre;
        private String publisher;

        public BookBuilder(String title) {
            this.title = title;
        }

        public BookBuilder setAuthors(List<String> authors) {
            this.authors = authors;
            return this;
        }

        public BookBuilder setEdition(String edition) {
            this.edition = edition;
            return this;
        }

        public BookBuilder setGenre(String genre) {
            this.genre = genre;
            return this;
        }

        public BookBuilder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
