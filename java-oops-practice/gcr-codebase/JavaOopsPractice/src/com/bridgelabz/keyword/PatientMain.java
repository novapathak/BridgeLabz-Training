package com.bridgelabz.keyword;

public class PatientMain {

    public static void main(String[] args) {

        Patient.setHospitalName("City Hospital");

        Patient p1 = new Patient("Lathika", 30, "Flu", "P001");
        Patient p2 = new Patient("Lidiya", 45, "Fracture", "P002");

        System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());

        p1.displayPatientDetails();
        System.out.println();
        p2.displayPatientDetails();
    }
}
