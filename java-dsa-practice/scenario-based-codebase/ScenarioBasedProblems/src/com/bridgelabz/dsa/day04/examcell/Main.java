package com.bridgelabz.dsa.day04.examcell;

public class Main {
    public static void main(String[] args) {

        Student[] students = { new Student("Aman", 85),
        			new Student("Neha", 92),
        		new Student("Ravi", 78),
            new Student("Pooja", 90)
        };

        ExamCell ec = new ExamCell();
        ec.mergeSort(students, 0, students.length - 1);
        ec.display(students);
    }
}
