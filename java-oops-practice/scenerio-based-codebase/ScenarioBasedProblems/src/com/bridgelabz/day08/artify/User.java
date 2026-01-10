package com.bridgelabz.day08.artify;

public class User {

    private String name;
    private double walletBalance;

    public User(String name, double walletBalance) {
        this.name = name;
        this.walletBalance = walletBalance;
    }

    public boolean deductAmount(double amount) {
        if (walletBalance >= amount) {
            walletBalance -= amount;   // operator -
            return true;
        }
        return false;
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    public String getName() {
        return name;
    }
}
