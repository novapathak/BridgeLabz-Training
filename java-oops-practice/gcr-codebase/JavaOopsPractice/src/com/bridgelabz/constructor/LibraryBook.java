package com.bridgelabz.constructor;
class LibraryBook {

    String title, author;
    double price;
    boolean available = true; // book is available at start

    // constructor
    LibraryBook(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    // method to borrow book
    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book borrowed");
        } else {
            System.out.println("Book not available");
        }
    }

    public static void main(String[] args) {
        LibraryBook b = new LibraryBook("Java", "James", 400);
        b.borrowBook();
        b.borrowBook();
    }
}
