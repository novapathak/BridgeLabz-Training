package com.bridgelabz.dsa.practice;

public class LinkedList {
	public static void main(String[]args) {
		AllMethods a = new AllMethods();
		
		//Insert at first
		a.insertAtFirst(3);
		a.insertAtFirst(30);
		a.insertAtFirst(13);
		System.out.println("");
		//insert at last
		a.insertAtLast(8);
		
		//display
		a.display();
		//insert at particular index
		a.insertIndex(32,2);
		
		//display
		a.display();
		
		//insert at last
		a.insertAtLast(10);
		
				
		//delete first
		a.deleteFirst();
		
		//display
		a.display();
		
		//delete last
		a.deleteLast();
		
		//display
		a.display();
	
		//delete particular index
		a.deleteIndex(1);
		
		//Search value
		a.Search(32);
	}

}
