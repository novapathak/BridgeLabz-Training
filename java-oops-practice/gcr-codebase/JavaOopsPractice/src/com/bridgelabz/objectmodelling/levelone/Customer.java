package com.bridgelabz.objectmodelling.levelone;

public class Customer {

    private String name;
    private double balance;
    private Bank bank; // Association with Bank

    // Constructor
    public Customer(String name) {
        this.name = name;
    }

    // View balance method
    public void viewBalance() {
        System.out.println(name + "'s balance in "
                + bank.getBankName() + " is ₹" + balance);
    }

    // Setters (used by Bank)
    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter
    public String getName() {
        return name;
    }
}
