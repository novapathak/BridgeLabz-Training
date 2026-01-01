package com.bridgelabz.objectmodelling.levelone;

public class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }

    public void displayFaculty() {
        System.out.println("Faculty Name: " + name);
    }
}
