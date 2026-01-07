package com.bridgelabz.day04.fittrack;

public class FitnessTracker implements ITrackable {
    private Workout workout;
    private int dailyTarget = 500;

    public FitnessTracker(Workout workout) {
        this.workout = workout;
    }

    @Override
    public void startWorkout() {
        System.out.println("Workout started: " + workout.type);
    }

    @Override
    public void stopWorkout() {
        workout.calculateCalories();
        int remaining = dailyTarget - (int) workout.caloriesBurned;
        System.out.println("Calories burned: " + workout.caloriesBurned);
        System.out.println("Remaining target: " + remaining);
    }
}
