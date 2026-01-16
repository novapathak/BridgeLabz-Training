package com.bridgelabz.dsa.practice;

public class AllMethods {
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
		
	}
	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			System.out.println("List is empty, adding element in 1st place.");
			return;
		}
		Node current = head;
		while(current.next!=null) {
			current = current.next;
		}
		current.next = newNode;
	}
	public void insertIndex(int data, int index) {
		Node newNode = new Node(data);
		int count = 0;
		if(index == 1) {
			head = newNode;
			return;
		}
		Node current = head;
		while(count < index-1 && current !=null) {
			current = current.next;
			count++;
		}
		if(current == null) {
			System.out.println("position out of range");
			return;
		}
		newNode.next = current.next;
		current.next = newNode; 
	}
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		head = head.next;
	}
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node current = head;
		while(current.next.next != null) {
			current = current.next;
		}
		current.next = null;
}
	public void deleteIndex(int index) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		if(index == 1) {
			head = head.next;
		}
		Node current = head;
		int count = 0;
		while(current != null && count < index-1) {
			current = current.next;
		}
		if(current == null || current.next == null) {
			System.out.println("Index out of range");
			return;
		}
		current.next = current.next.next;
	}
	public void Search(int data) {
		if(head==null) {
			System.out.println("List is empty");
			return;
		}
		Node current = head;
		int count = 0;
		while(current!=null) {
			if(data == current.data) {
				System.out.println(data + "found at index" + count);
				return;
			}
			count++;
			current = current.next;
			
			
		}
		System.out.println("Not found");
			
		}
	public void reverse() {
		Node current = head;
		Node prev = null;
		Node next;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
	}
	public void display() {
		Node current = head;
		while(current != null) {
			System.out.print(current.data + "--> ");
			current = current.next;
		}
		System.out.print("Null ");
	}
	
}