package com.bridgelabz.day07.medistore;

import java.time.LocalDate;

public class MediStoreApp {
    public static void main(String[] args) {

        Medicine med1 = new Tablet("Paracetamol", 10, LocalDate.of(2026, 5, 10));
        Medicine med2 = new Syrup("Cough Syrup", 120, LocalDate.of(2026, 3, 20));
        Medicine med3 = new Injection("Insulin", 300, LocalDate.of(2026, 2, 15));

        System.out.println("Total Bill: " + med1.sell(20));
        System.out.println("Total Bill: " + med2.sell(3));
        System.out.println("Total Bill: " + med3.sell(2));
    }
}
