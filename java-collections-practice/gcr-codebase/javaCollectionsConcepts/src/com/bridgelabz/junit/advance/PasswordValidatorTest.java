package com.bridgelabz.junit.advance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {

    PasswordValidator validator = new PasswordValidator();

    @Test
    void testValidPassword() {
        assertTrue(validator.isValid("Strong1A"));
    }

    @Test
    void testInvalidPassword() {
        assertFalse(validator.isValid("weak"));
    }
}
