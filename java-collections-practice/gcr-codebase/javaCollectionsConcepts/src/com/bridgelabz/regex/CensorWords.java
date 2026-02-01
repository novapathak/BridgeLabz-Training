package com.bridgelabz.regex;

public class CensorWords {
    public static void main(String[] args) {
        String text = "This is a damn bad example with some stupid words";
        String pattern = "\\b(damn|stupid)\\b";

        String result = text.replaceAll(pattern, "****");
        System.out.println(result);
    }
}
