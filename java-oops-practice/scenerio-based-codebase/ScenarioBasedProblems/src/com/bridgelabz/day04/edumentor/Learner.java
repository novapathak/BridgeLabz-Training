package com.bridgelabz.day04.edumentor;

public class Learner extends User implements ICertifiable {

    public Learner(String name, String email, int userId) {
        super(name, email, userId);
    }

    @Override
    public void generateCertificate(String courseType) {
        if (courseType.equalsIgnoreCase("short")) {
            System.out.println("Short Course Certificate issued to " + name);
        } else {
            System.out.println("Full-Time Course Certificate issued to " + name);
        }
    }
}
