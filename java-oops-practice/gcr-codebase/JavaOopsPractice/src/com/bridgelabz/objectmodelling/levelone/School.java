package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

public class School {

    private String schoolName;
    private ArrayList<Student> students = new ArrayList<>();

    public School(String schoolName) {
        this.schoolName = schoolName;
    }

    public void addStudent(Student student) {
        students.add(student);
    }
}
