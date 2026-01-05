package com.bridgelabz.day01.hospitalmanagementsystem;

class Patient {
    protected int id;
    protected String name;
    private String medicalHistory; // sensitive data

    // Normal admission
    Patient(int id, String name) {
        this.id = id;
        this.name = name;
        this.medicalHistory = "Not provided";
    }

    // Emergency admission (overloaded constructor)
    Patient(int id, String name, String medicalHistory) {
        this.id = id;
        this.name = name;
        this.medicalHistory = medicalHistory;
    }

    public String getSummary() {
        return "Patient ID: " + id + ", Name: " + name;
    }

    public void displayInfo() {
        System.out.println(getSummary());
    }
}
