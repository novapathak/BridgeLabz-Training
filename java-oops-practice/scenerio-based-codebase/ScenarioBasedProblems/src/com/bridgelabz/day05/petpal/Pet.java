package com.bridgelabz.day05.petpal;

import java.util.Random;

public abstract class Pet implements IInteractable {
    protected String name;
    protected String type;
    protected int age;

    private int hunger;
    private int energy;
    private String mood;

    public Pet(String name, String type, int age) {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(50) + 50;
        this.energy = rand.nextInt(50) + 50;
        updateMood();
    }

    protected void updateMood() {
        if (energy > 70 && hunger < 40)
            mood = "Happy";
        else if (energy < 30)
            mood = "Tired";
        else
            mood = "Normal";
    }

    @Override
    public void feed() {
        hunger -= 20;
        energy += 10;
        updateMood();
    }

    @Override
    public void play() {
        energy -= 20;
        hunger += 15;
        updateMood();
    }

    @Override
    public void sleep() {
        energy += 30;
        hunger += 10;
        updateMood();
    }

    public void showStatus() {
        System.out.println(name + " | Mood: " + mood +
                " | Hunger: " + hunger + " | Energy: " + energy);
    }

    public abstract void makeSound();
}
