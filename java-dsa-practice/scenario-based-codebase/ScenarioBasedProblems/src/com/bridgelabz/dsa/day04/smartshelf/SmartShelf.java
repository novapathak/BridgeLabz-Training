package com.bridgelabz.dsa.day04.smartshelf;

public class SmartShelf {
	
	    void insertionSort(Book[] books) {
	        for (int i=1;i<books.length;i++) {
	            Book key=books[i];
	            int j = i-1;

	            while (j>=0&&books[j].title.compareTo(key.title)>0) {
	                books[j+1] = books[j];
	                j--;
	            }
	            books[j+ 1] = key;
	        }
	    }
	    void display(Book[] books) {
	        for (Book b : books) {
	            System.out.println(b.title);
	        }
	    }
	}



