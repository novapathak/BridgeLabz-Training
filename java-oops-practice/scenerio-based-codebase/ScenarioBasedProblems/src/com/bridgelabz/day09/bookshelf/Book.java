package com.bridgelabz.day09.bookshelf;

public class Book {
	
	private String title;
	private String author;
	
    public Book(String title, String author) {
    	this.author= author;
    	this.title = title;
    }
    
    public String gettitle() {
    	return title;
    }
    public String getAuthor() {
    	return author;
    }
    
    @Override
    public String toString() {
    	return title + " by "+ author;
    }
}
