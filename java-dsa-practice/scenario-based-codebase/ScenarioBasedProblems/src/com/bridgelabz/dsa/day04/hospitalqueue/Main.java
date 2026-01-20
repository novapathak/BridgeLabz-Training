package com.bridgelabz.dsa.day04.hospitalqueue;

public class Main {
    public static void main(String[] args) {

        Patient[] patient = { new Patient("Ravi", 3), 
        		new Patient("Anita", 8),
            new Patient("Kiran", 5),
            new Patient("Meena", 9)
        };

        Patient ps = new Patient();

        System.out.println("Before Sorting:");
        ps.display(patient);

        ps.bubbleSort(patient);

        System.out.println("\nAfter Sorting by Criticality:");
        ps.display(patient);
    }
}
