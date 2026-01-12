package com.bridgelabz.day08.skillforge;

class Student extends User {
    private int progress;

    public Student(String name) {
        super(name);
    }

    public void updateProgress(int marks) {
        progress += marks;
    }
}
