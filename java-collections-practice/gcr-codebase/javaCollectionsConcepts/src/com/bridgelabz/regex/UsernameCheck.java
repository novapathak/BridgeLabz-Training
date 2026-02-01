package com.bridgelabz.regex;

import java.util.regex.*;

public class UsernameCheck {
    public static void main(String[] args) {
        String username = "user_123";
        String pattern = "^[A-Za-z][A-Za-z0-9_]{4,14}$";

        if (username.matches(pattern)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
