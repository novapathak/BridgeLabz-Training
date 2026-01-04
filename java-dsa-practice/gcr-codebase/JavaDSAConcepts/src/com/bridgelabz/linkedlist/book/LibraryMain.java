package com.bridgelabz.linkedlist.book;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryList library = new LibraryList();

        library.addBook(1, "Java", "James", "Programming", true);
        library.addBook(2, "DSA", "Mark", "CS", false);

        library.displayForward();
        library.displayReverse();
    }
}
