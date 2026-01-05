package com.bridgelabz.day02.mybank;

class CurrentAccount extends Account {
    private final double interestRate = 2.0;

    CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    double calculateInterest() {
        return getBalanceInternal() * interestRate / 100;
    }
}

