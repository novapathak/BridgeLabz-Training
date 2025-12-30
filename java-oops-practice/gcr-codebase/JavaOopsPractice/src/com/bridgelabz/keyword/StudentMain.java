package com.bridgelabz.keyword;

public class StudentMain {

    public static void main(String[] args) {

        Student.setUniversityName("Global University");

        Student s1 = new Student("Hemashree", 101, 'A');
        Student s2 = new Student("Sharmila", 102, 'B');

        Student.displayTotalStudents();

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();

        s2.updateGrade('A');
        System.out.println();
        s2.displayStudentDetails();
    }
}
