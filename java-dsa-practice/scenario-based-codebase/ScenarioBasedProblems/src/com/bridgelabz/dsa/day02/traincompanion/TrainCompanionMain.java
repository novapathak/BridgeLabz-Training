package com.bridgelabz.dsa.day02.traincompanion;

public class TrainCompanionMain {
	public static void main(String[] args) {
		Train train = new Train();
		train.addCompartment("Engine");
		train.addCompartment("Pantry");
		train.addCompartment("Sleeper");
		train.addCompartment("AC");
		
		train.traverseForward();
		train.traverseBackward();
		
		train.showAdjacent("Pantry");
		train.showAdjacent("AC");
		
		train.removeCompartment("Sleeper");
		train.traverseForward();
     	}

}
