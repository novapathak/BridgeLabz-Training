package com.bridgelabz.regex;

public class LicensePlateCheck {
    public static void main(String[] args) {
        String plate = "AB1234";
        String pattern = "^[A-Z]{2}[0-9]{4}$";

        System.out.println(plate.matches(pattern));
    }
}
