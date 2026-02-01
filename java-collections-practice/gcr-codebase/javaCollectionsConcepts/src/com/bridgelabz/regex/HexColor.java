package com.bridgelabz.regex;

public class HexColor {
    public static void main(String[] args) {
        String color = "#FFA500";
        String pattern = "^#[0-9a-fA-F]{6}$";

        System.out.println(color.matches(pattern));
    }
}

