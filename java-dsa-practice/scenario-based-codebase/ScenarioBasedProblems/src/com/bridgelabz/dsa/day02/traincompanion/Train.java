package com.bridgelabz.dsa.day02.traincompanion;

public class Train {
	
	private Compartment head;
	
	public void addCompartment(String name) {
		Compartment newComp = new Compartment(name);
		
		if(head == null) {
			head = newComp;
			return;
		}
		Compartment temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = newComp;
		
		newComp.prev = temp;
	}
	
	
	
	//Traverse 
	public void traverseForward() {
	Compartment temp = head;
	System.out.println("Forward");
	while(temp !=null) {
		System.out.print(temp.name + " --> ");
		temp = temp.next;
	}
	}

	public void traverseBackward() {
		Compartment temp = head ;
		if(temp == null) return;
		while(temp!=null) {
			temp = temp.next;
		}
		
		System.out.println(" Backward");
		while(temp !=null) {
			System.out.print(temp.name + " --> ");
			temp = temp.prev;
		}
	}
	public void removeCompartment(String name) {
		Compartment temp = head;
		while(temp != null) {
			if(temp.name.equals(name)) {
				if(temp.prev!=null)
					temp.prev.next = temp.next;
				else 
					head = temp.next;
				
				if(temp.next!= null)
					temp.next.prev = temp.prev;
			System.out.println(name + "removed");
			return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found");
	
}
	
	//Display adjacent compartment
	public void showAdjacent(String name) {
		Compartment temp = head;
		while(temp != null) {
			if(temp.name.equals(name)) {
				System.out.println("Current: "+temp.name);
				System.out.println("Previous: "+(temp.prev!=null? temp.prev.name : "None"));
				System.out.println("Next: "+(temp.next!=null? temp.next.name : "None"));
			    return;
			}
			temp = temp.next;
		}
		System.out.println("Compartment not found");
	}
}