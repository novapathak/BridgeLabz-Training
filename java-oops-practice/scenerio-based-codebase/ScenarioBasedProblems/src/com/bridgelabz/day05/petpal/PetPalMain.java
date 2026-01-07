package com.bridgelabz.day05.petpal;

public class PetPalMain {
	
	    public static void main(String[] args) {

	        Pet dog = new Dog("Buddy", 2);
	        Pet cat = new Cat("Luna", 1);

	        dog.makeSound();
	        dog.feed();
	        dog.play();
	        dog.showStatus();

	        cat.makeSound();
	        cat.sleep();
	        cat.showStatus();
	    
	}


}
