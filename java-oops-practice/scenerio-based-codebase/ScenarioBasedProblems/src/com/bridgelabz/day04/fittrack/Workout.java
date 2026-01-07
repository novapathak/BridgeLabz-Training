package com.bridgelabz.day04.fittrack;

public abstract class Workout {
    protected String type;
    protected int duration; // minutes
    protected double caloriesBurned;

    public Workout(String type, int duration) {
        this.type = type;
        this.duration = duration;
    }

    public abstract void calculateCalories();
}
