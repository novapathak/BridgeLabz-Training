package com.bridgelabz.dsa.reviewquestion;
import java.util.*;
public class Implement {
	Node head;
	
	public void insertElement(int data, int index) {
		Node newNode = new Node(data);

		if(head==null) {
			head=newNode;
			return ;
		}
		
		Node current = head;
		int count = 0;
		while(current!= null && count<index-1) {
			current = current.next;
			count++;
		}
	    newNode.next = current.next;
	    current.next = newNode;
		
	}
	
	public void deleteElement(int index) {
		Node current = head;		
		int count = 0;
		if(head == null) {
			System.out.println("List is already empty");
			return;
		}
		
	while(current!=null && count< index-1) {
		current = current.next;
		count++;
	}
	current.next = current.next.next;	}
	
	public void display() {
		Node current = head;
		while(current !=null) {
			System.out.print(current.data+"--> ");
			current = current.next;
		}
	}
}
