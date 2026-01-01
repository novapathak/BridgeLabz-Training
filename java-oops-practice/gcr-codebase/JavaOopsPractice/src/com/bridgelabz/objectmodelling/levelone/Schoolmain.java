package com.bridgelabz.objectmodelling.levelone;

public class Schoolmain {

    public static void main(String[] args) {

        School school = new School("Green Valley School");

        Student s1 = new Student("Amit");
        Student s2 = new Student("Neha");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        s1.viewCourses();
        c1.showStudents();
    }
}
