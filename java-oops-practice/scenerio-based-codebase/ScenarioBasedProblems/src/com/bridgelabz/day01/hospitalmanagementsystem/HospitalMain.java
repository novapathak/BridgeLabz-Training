package com.bridgelabz.day01.hospitalmanagementsystem;

public class HospitalMain {
    public static void main(String[] args) {
        Patient p1 = new InPatient(1, "Amit", 5);
        Patient p2 = new OutPatient(2, "Ravi");

        p1.displayInfo();
        p2.displayInfo();

        Bill bill = new Bill(5000);
        System.out.println("Total Bill: " + bill.calculatePayment());
    }
}
