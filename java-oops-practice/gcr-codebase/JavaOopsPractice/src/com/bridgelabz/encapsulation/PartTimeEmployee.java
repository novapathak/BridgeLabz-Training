package com.bridgelabz.encapsulation;

public class PartTimeEmployee extends Employee {

    private int hoursWorked;
    private double ratePerHour;

    public PartTimeEmployee(int id, String name, int hours, double rate) {
        super(id, name, 0);
        this.hoursWorked = hours;
        this.ratePerHour = rate;
    }

    public double calculateSalary() {
        return hoursWorked * ratePerHour;
    }
}
