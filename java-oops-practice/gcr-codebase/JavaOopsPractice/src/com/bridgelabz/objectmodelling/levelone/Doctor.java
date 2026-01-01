package com.bridgelabz.objectmodelling.levelone;

public class Doctor {
    private String name;

    public Doctor(String name) {
        this.name = name;
    }

    public void consult(Patient patient) {
        System.out.println("Doctor " + name + " is consulting Patient " + patient.getName());
    }
}
