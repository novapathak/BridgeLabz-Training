package com.bridgelabz.encapsulation;

public class CurrentAccount extends BankAccount implements Loanable {

    private double interestRate = 0.02; // 2%

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * interestRate;
    }

    @Override
    public void applyForLoan() {
        System.out.println("Current Account Loan Applied");
    }

    @Override
    public double calculateLoanEligibility() {
        return balance * 10;
    }
}
