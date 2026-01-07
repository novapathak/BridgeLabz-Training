package com.bridgelabz.day06.bookbazaar;

public class BookBazaarMain {

	    public static void main(String[] args) {

	        Book ebook = new EBook("Java Basics", "James Gosling", 500);
	        Book printed = new PrintedBook("OOP Concepts", "Herbert Schildt", 700, 10);

	        Order order1 = new Order("Rohit", ebook, 1);
	        Order order2 = new Order("Rohit", printed, 2);

	        System.out.println("EBook Order Total: ₹" + order1.calculateTotal());
	        System.out.println("Printed Book Order Total: ₹" + order2.calculateTotal());
	    }


}
