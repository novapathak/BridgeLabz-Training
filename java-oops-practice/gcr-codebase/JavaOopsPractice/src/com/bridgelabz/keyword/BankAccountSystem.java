package com.bridgelabz.keyword;

public class BankAccountSystem {

    public static String bankName = "SBI";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccountSystem(String accountHolderName, String accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Instance method
    public void displayAccountDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Getter & Setter
    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Business methods
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.err.println("Insufficient balance or invalid amount.");
        }
    }
}
