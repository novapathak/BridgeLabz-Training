package com.bridgelabz.day09.bookshelf;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

public class Library {
	
	HashMap<String,LinkedList<Book>> catalog;
	HashSet<String>bookSet;
	
	public Library(){
		catalog = new HashMap<>();
		bookSet = new HashSet<>();
				
	}
	
	public void addBook(String genre, Book book) {
		if(bookSet.contains(book.gettitle())) {
			System.out.println("Book already exist !");
			return;
			
		}
	
	if(!catalog.containsKey(genre)) {
		catalog.put(genre, new LinkedList<Book>());
	}
	catalog.get(genre).add(book);
	bookSet.add(book.gettitle());
	
	System.out.println("Book added successfully");
	

}
	//Remove book
	
	public void removeBook(String genre, String title) {
		if(catalog.containsKey(genre)) {
			LinkedList<Book> books = catalog.get(genre);
			
			for(Book b : books) {
				if(b.gettitle().equals(title)) {
					books.remove(b);
					bookSet.remove(title);
					System.out.println("Book removed");
					return;
				}
			}
			System.out.println("Book not found in this genre");
		} else {
			System.out.println("genre not found");
		}
	}
	public void displayCatalog() {
		for(String genre : catalog.keySet()) {
			System.out.println("Genre: "+genre);
			LinkedList<Book> books = catalog.get(genre);
			for(Book b : books) {
				System.out.println("-" + b);
			}
		}
	}
}
	
