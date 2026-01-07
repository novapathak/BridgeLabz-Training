package com.bridgelabz.day06.loanbuddy;

public abstract class LoanApplication implements IApprovable {
    protected String loanType;
    protected int termMonths;
    protected double interestRate;

    private boolean approved; // restricted access

    public LoanApplication(String loanType, int termMonths, double interestRate) {
        this.loanType = loanType;
        this.termMonths = termMonths;
        this.interestRate = interestRate;
        this.approved = false;
    }

    protected void setApproved(boolean status) {
        this.approved = status;
    }

    public boolean isApproved() {
        return approved;
    }

    @Override
    public double calculateEMI(double P, double R, int N) {
        R = R / (12 * 100); // monthly interest
        return (P * R * Math.pow(1 + R, N)) /
               (Math.pow(1 + R, N) - 1);
    }
}
