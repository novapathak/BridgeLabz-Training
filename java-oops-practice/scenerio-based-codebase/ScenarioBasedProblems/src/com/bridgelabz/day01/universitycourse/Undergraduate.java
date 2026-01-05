package com.bridgelabz.day01.universitycourse;

class Undergraduate extends Student implements Graded {

    Undergraduate(int id, String name) {
        super(id, name);
    }

    public void assignGrade(int marks) {
        setGpa(marks / 10.0);
    }
}
