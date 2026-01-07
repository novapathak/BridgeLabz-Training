package com.bridgelabz.day03.campusconnect;

import java.util.ArrayList;

public class Course implements ICourseActions {
    private String courseName;
    private Faculty faculty;
    private ArrayList<Student> students;

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    @Override
    public void enrollCourse(Student student) {
        students.add(student);
        System.out.println(student.name + " enrolled in " + courseName);
    }

    @Override
    public void dropCourse(Student student) {
        students.remove(student);
        System.out.println(student.name + " dropped " + courseName);
    }
}
