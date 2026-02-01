package com.bridgelabz.junit.advance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {

    UserRegistration registration = new UserRegistration();

    @Test(expected = Exception.class)
    void testValidUser() {
        assertDoesNotThrow(() -> registration.registerUser("user", "user@mail.com", "Pass1234"));
    }

    @Test(expected = Exception.class)

    void testInvalidUser() {
        assertThrows(IllegalArgumentException.class, () ->
                registration.registerUser(null, "mail", "pass"));
    }
}
