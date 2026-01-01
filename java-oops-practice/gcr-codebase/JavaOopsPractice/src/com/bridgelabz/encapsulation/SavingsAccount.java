package com.bridgelabz.encapsulation;

public class SavingsAccount extends BankAccount implements Loanable {

    private double interestRate = 0.04; // 4%

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Savings Account Loan Applied");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 5;
    }
}
