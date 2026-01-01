package com.bridgelabz.objectmodelling.levelone;

public class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public void assignProfessor(CourseUni c1) {
        System.out.println(name + " is teaching " + c1.courseName);
    }
}
