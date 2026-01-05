package com.bridgelabz.day01.universitycourse;

public class UniversityMain {
    public static void main(String[] args) {
        Student s = new Undergraduate(1, "Neha");
        Graded g = (Graded) s;

        g.assignGrade(85);
        System.out.println(s.getTranscript());
    }
}
