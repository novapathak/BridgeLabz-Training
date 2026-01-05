package com.bridgelabz.day01.hospitalmanagementsystem;

class InPatient extends Patient {
    int daysAdmitted;

    InPatient(int id, String name, int days) {
        super(id, name);
        this.daysAdmitted = days;
    }

    @Override
    public void displayInfo() {
        System.out.println("InPatient: " + name + ", Days: " + daysAdmitted);
    }
}
