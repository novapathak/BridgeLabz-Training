package com.bridgelabz.dsa.day06.smartlibrary;

public class Main {
	
	    public static void main(String[] args) {

	        Book[] books = {
	            new Book("Java"),
	            new Book("Python"),
	            new Book("C"),
	            new Book("Data Structures")
	        };

	        SmartLibrary library = new SmartLibrary();
	        System.out.println("Before Sorting:");
	        library.display(books);
	        library.insertionSort(books);
	        System.out.println("\nAfter Sorting:");
	        library.display(books);
	    }
	}

