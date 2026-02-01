package com.bridgelabz.junit;

public class StringUtils {

    public String reverse(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result = result + str.charAt(i);
        }
        return result;
    }

    public boolean isPalindrome(String str) {
        return str.equals(reverse(str));
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }
}
