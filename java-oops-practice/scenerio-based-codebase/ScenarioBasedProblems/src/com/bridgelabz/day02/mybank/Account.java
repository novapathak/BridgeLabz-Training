package com.bridgelabz.day02.mybank;

abstract class Account implements ITransaction {
    protected String accountNumber;
    private double balance; // hidden

    Account(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    Account(String accountNumber, double openingBalance) {
        this.accountNumber = accountNumber;
        this.balance = openingBalance;
    }

    protected double getBalanceInternal() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }

    public double checkBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    // Polymorphism
    abstract double calculateInterest();
}
