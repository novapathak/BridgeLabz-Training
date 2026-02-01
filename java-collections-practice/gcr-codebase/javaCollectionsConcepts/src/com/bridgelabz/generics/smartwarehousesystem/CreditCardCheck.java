package com.bridgelabz.generics.smartwarehousesystem;

public class CreditCardCheck {
    public static void main(String[] args) {
        String card = "4123456789012345";
        String pattern = "^(4[0-9]{15}|5[0-9]{15})$";

        System.out.println(card.matches(pattern));
    }
}
