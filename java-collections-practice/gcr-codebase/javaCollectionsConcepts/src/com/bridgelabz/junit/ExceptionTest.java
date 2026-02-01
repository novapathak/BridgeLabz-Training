package com.bridgelabz.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionTest {

    @Test
    void testArithmeticException() {
        assertThrows(ArithmeticException.class, () -> {
            int result = 10 / 0;
        });
    }
}
