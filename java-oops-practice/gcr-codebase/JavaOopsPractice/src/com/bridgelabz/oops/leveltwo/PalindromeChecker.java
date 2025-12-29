package com.bridgelabz.oops.leveltwo;

public class PalindromeChecker {

    String text;

    // Constructor
    PalindromeChecker(String text) {
        this.text = text;
    }

    // Check palindrome
    boolean isPalindrome() {
        String cleanText = text.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversed);
    }

    // Display result
    void displayResult() {
        if (isPalindrome())
            System.out.println(text + " is a Palindrome");
        else
            System.out.println(text + " is NOT a Palindrome");
    }

    public static void main(String[] args) {
        new PalindromeChecker("A man a plan a canal Panama").displayResult();
        new PalindromeChecker("Hello").displayResult();
    }
}
