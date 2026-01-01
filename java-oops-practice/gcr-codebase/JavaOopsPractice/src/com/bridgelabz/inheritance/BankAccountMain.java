package com.bridgelabz.inheritance;

public class BankAccountMain  {

    public static void main(String[] args) {

        BankAccount a1 = new SavingsAccount("SB101", 50000, 4.5);
        BankAccount a2 = new CheckingAccount("CA102", 30000, 10000);
        BankAccount a3 = new FixedDepositAccount("FD103", 100000, 5);

        a1.displayAccountType();
        System.out.println();

        a2.displayAccountType();
        System.out.println();

        a3.displayAccountType();
    }
}

