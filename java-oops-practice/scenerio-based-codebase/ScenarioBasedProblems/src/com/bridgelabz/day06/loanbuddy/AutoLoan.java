package com.bridgelabz.day06.loanbuddy;

public class AutoLoan extends LoanApplication {

    public AutoLoan(int termMonths) {
        super("Auto Loan", termMonths, 9.5);
    }

    @Override
    public boolean approveLoan(Applicant applicant) {
        if (applicant.getCreditScore() >= 650) {
            setApproved(true);
        }
        return isApproved();
    }
}
