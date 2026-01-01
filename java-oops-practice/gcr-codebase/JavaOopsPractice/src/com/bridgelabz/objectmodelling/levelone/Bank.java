package com.bridgelabz.objectmodelling.levelone;

public class Bank {

    private String bankName;

    // Constructor
    public Bank(String bankName) {
        this.bankName = bankName;
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer, double initialBalance) {
        customer.setBank(this);
        customer.setBalance(initialBalance);
        System.out.println("Account opened for " + customer.getName()
                + " in " + bankName + " with balance ₹" + initialBalance);
    }

    // Getter
    public String getBankName() {
        return bankName;
    }
}
