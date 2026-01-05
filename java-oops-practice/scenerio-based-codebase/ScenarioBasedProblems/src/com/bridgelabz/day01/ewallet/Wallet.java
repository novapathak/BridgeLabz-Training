package com.bridgelabz.day01.ewallet;

class Wallet {
    private double balance;

    Wallet(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    protected void addMoney(double amount) {
        balance += amount;
    }

    protected boolean deduct(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
