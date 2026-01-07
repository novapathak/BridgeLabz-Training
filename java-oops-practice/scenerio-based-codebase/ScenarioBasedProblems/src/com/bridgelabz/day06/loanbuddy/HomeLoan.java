package com.bridgelabz.day06.loanbuddy;

public class HomeLoan extends LoanApplication {

    public HomeLoan(int termMonths) {
        super("Home Loan", termMonths, 8.5);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 700 && applicant.getIncome() >= 30000) {
            setApproved(true);
        }
        return isApproved();
    }
}
