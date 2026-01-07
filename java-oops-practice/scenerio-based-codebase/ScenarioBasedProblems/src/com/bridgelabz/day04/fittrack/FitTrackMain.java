package com.bridgelabz.day04.fittrack;

public class FitTrackMain {
	
	    public static void main(String[] args) {

	        Workout cardio = new CardioWorkout(30);
	        FitnessTracker tracker = new FitnessTracker(cardio);

	        tracker.startWorkout();
	        tracker.stopWorkout();
	    }
	


}
