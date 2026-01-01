package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class PatientMain {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient("P101", "Rahul", 35, 5, 2000));
        patients.add(new OutPatient("P202", "Anita", 28, 500));

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill Amount : ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("General Checkup");
                m.viewRecords();
            }

            System.out.println("--------------------------------");
        }
    }
}
