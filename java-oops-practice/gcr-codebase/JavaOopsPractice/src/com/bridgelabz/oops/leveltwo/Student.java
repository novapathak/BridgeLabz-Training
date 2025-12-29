package com.bridgelabz.oops.leveltwo;

public class Student {

    String name;
    String rollNumber;
    double[] marks;

    // Constructor
    Student(String name, String rollNumber, double[] marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }

    // Calculate average marks
    double calculateAverage() {
        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }
        return sum / marks.length;
    }

    // Calculate grade
    String calculateGrade() {
        double avg = calculateAverage();

        if (avg >= 80) return "Grade A";
        else if (avg >= 60) return "Grade B";
        else if (avg >= 50) return "Grade C";
        else if (avg >= 40) return "Grade D";
        else return "Grade F";
    }

    // Display student details
    void displayStudent() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNumber);
        System.out.println("Grade: " + calculateGrade());
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Student s1 = new Student("Thamarai", "ECE001", new double[]{80, 70, 75});
        Student s2 = new Student("Kannan", "CSC002", new double[]{60, 65, 50});

        s1.displayStudent();
        s2.displayStudent();
    }
}
