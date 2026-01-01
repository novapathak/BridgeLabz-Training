package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

public class Student {

    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    public void viewCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
