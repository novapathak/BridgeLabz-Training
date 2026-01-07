package com.bridgelabz.day03.campusconnect;

public class Student extends Person {
    private int[] grades;   

    public Student(int id, String name, String email, int[] grades) {
        super(id, name, email);
        this.grades = grades;
    }

    public double calculateGPA() {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return (double) total / grades.length / 10; 
    }

    @Override
    public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + calculateGPA());
    }
}
