package com.bridgelabz.objectmodelling.levelone;

public class HospitalMain {
    public static void main(String[] args) {

        Doctor d1 = new Doctor("Dr. Rao");
        Doctor d2 = new Doctor("Dr. Singh");

        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Riya");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
