package com.bridgelabz.day02.mybank;

class SavingsAccount extends Account {
    private final double interestRate = 4.0;

    SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    double calculateInterest() {
        return getBalanceInternal() * interestRate / 100;
    }
}
