package com.bridgelabz.day09.bookshelf;

public class Main {
	public static void main(String[] args) {
	Library library = new Library();
	
	Book b1 = new Book("Harry Potter", "J.K Rowling");
    Book b2 = new Book("The Hobbit", "J.R.R Tolkien");
    Book b3 = new Book("Physics Fundamentals", "H.C Verma");
    
    library.addBook("Fiction", b1);
    library.addBook("Fiction", b2);
    library.addBook("Science", b3);

    System.out.println("\nLibrary Catalog:\n");
    library.displayCatalog();

    library.removeBook("Fiction", "Harry Potter");

    System.out.println("\nAfter Removing:\n");
    library.displayCatalog();
}
}
