package com.bridgelabz.day01.hospitalmanagementsystem;

class Bill implements Payable {
    double amount;
    double tax = 0.05;

    Bill(double amount) {
        this.amount = amount;
    }

    @Override
    public double calculatePayment() {
        return amount + (amount * tax);
    }
}
