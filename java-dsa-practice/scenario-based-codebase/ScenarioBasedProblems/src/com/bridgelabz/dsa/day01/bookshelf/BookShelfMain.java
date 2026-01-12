package com.bridgelabz.dsa.day01.bookshelf;

public class BookShelfMain {
    public static void main(String[] args) {

        Library library = new Library();

        library.addBook("Fiction", new Book("1984", "George Orwell", "101"));
        library.addBook("Fiction", new Book("Animal Farm", "George Orwell", "102"));
        library.addBook("Science", new Book("Time", "Stephen Hawking", "201"));

        library.display();

        library.borrowBook("Fiction", "101");
        library.display();
    }
}
