package com.bridgelabz.junit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest {

    @Test
    @Timeout(2)
    void testLongTask() throws InterruptedException {
        Thread.sleep(3000);
    }
}
