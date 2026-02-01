package com.bridgelabz.generics.onlinemarketplace;

public class Main {
	public static void main(String[]args) {
		Product<Book>book = new Product<>("Java", 500, new Book());
		
		book.displayProduct();
		
		System.out.println("After Discount ");
		Discount.discount(book, 20);
		book.displayProduct();
	}

}
