package com.bridgelabz.regex;

public class SSNCheck {
    public static void main(String[] args) {
        String ssn = "123-45-6789";
        String pattern = "^\\d{3}-\\d{2}-\\d{4}$";

        System.out.println(ssn.matches(pattern));
    }
}
