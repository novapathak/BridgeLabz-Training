package com.bridgelabz.junit.advance;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void testWithdraw() {
        BankAccount account = new BankAccount();
        account.deposit(500);
        account.withdraw(200);
        assertEquals(300, account.getBalance());
    }

    @Test
    void testInsufficientFunds() {
        BankAccount account = new BankAccount();
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(100));
    }
}
