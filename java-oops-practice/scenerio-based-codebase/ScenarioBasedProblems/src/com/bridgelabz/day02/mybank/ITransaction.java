package com.bridgelabz.day02.mybank;

interface ITransaction {
    void deposit(double amount);
    void withdraw(double amount);
    double checkBalance();
}
