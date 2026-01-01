package com.bridgelabz.inheritance;

public class Intern extends Employee {

    private int duration; // in months

    public Intern(String name, int id, double salary, int duration) {
        super(name, id, salary);
        this.duration = duration;
    }

    @Override
    public void displayDetails() {
        System.out.println("\n--- Intern Details ---");
        super.displayDetails();
        System.out.println("Internship Duration : " + duration + " months");
    }
}
