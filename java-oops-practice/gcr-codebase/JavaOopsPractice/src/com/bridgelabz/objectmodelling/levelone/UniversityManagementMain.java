package com.bridgelabz.objectmodelling.levelone;

public class UniversityManagementMain {
    public static void main(String[] args) {

        CourseUni c1 = new CourseUni("Java Programming");
        CourseUni c2 = new CourseUni("Data Structures");

        StudentUni s1 = new StudentUni("Ankit");
        Professor p1 = new Professor("Dr. Verma");

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);

        p1.assignProfessor(c1);
    }
}
