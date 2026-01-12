package com.bridgelabz.day08.skillforge;

public class SkillForgeTest {
    public static void main(String[] args) {
        Instructor ins = new Instructor("Dr. Sharma");
        Course course = new Course("Java Mastery", ins);

        course.generateCertificate();
    }
}

