package com.bridgelabz.junit.advance;

public class UserRegistration {

    public void registerUser(String username, String email, String password) {
        if (username == null || email == null || password == null) {
            throw new IllegalArgumentException();
        }
    }
}
