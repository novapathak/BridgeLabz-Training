package com.bridgelabz.junit.advance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {

    DateFormatter formatter = new DateFormatter();

    @Test
    void testFormatDate() {
        assertEquals("25-12-2024", formatter.formatDate("2024-12-25"));
    }
}
