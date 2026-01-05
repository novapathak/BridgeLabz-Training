package com.bridgelabz.day01.universitycourse;

class Student {
    protected int id;
    protected String name;
    private double gpa;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getTranscript() {
        return "Name: " + name + ", GPA: " + gpa;
    }
}
