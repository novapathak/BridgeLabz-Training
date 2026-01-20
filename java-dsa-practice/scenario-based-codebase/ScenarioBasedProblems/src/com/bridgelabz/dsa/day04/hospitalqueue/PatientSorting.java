package com.bridgelabz.dsa.day04.hospitalqueue;
import java.util.*;
public class PatientSorting {
	public void bubbleSort(Patient[] patient) {
		int n = patient.length;
		
		for(int i = 0; i<n-1;i++) {
			for(int j = 0;j<n-1-i;j++) {
				if(patient[j].criticality < patient[j+1].criticality) {
					Patient temp = patient[j];
					 patient[j] = patient[j+1];
					 patient[j+1] = temp;
			}
		}
		
	}

}
	 void display(Patient[] patient) {
	        for (Patient p : patient) {
	            System.out.println(p.name + " - Criticality: " + p.criticality);
	        }
	    }
	}
