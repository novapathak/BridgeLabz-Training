package com.bridgelabz.dsa.day01.bookshelf;

import java.util.*;

public class Library {

    HashMap<String, LinkedList<Book>> catalog = new HashMap<>();
    HashSet<String> isbnSet = new HashSet<>();
    void addBook(String genre, Book book) {
        if (isbnSet.contains(book.isbn)) {
          System.out.println(" Book already exists");
            return;
        }
           catalog.putIfAbsent(genre, new LinkedList<>());
         catalog.get(genre).add(book);
           isbnSet.add(book.isbn);
    }
void borrowBook(String genre, String isbn ) {
        LinkedList<Book> books = catalog.get( genre);
        if (books == null) return;

    Iterator<Book> it = books.iterator();
        while (it.hasNext()) {
            Book b= it.next();
            if (b.isbn.equals(isbn)) {
            it.remove();
                isbnSet.remove(isbn);
                return;
            }
        }
    }

    void display() {
       for (String genre : catalog.keySet()) {
      System.out.println(genre + " : " + catalog.get(genre));
        }
    }
}
