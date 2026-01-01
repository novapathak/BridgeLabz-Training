package com.bridgelabz.objectmodelling.levelone;

public class StudentUni {
    private String name;

    public StudentUni(String name) {
        this.name = name;
    }

    public void enrollCourse(CourseUni course) {
        System.out.println(name + " enrolled in " + course.courseName);
    }
}
