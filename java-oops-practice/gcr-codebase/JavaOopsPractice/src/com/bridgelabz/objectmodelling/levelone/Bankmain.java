package com.bridgelabz.objectmodelling.levelone;

public class Bankmain {

    public static void main(String[] args) {

        // Create Bank
        Bank sbi = new Bank("State Bank of India");

        // Create Customers
        Customer c1 = new Customer("Ravi");
        Customer c2 = new Customer("Anita");

        // Open accounts
        sbi.openAccount(c1, 5000);
        sbi.openAccount(c2, 10000);

        // Customers check balance
        c1.viewBalance();
        c2.viewBalance();
    }
}
