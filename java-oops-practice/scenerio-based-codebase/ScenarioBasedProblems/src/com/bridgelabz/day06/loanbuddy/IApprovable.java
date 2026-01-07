package com.bridgelabz.day06.loanbuddy;

public interface IApprovable {
    boolean approveLoan(Applicant applicant);
    double calculateEMI(double principal, double rate, int months);
}
