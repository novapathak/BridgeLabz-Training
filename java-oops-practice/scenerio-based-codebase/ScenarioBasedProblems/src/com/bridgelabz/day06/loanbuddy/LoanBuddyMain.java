package com.bridgelabz.day06.loanbuddy;

public class LoanBuddyMain {
	
	    public static void main(String[] args) {

	        Applicant applicant = new Applicant("Amit", 720, 50000, 500000);

	        LoanApplication loan = new HomeLoan(240);

	        if (loan.approveLoan(applicant)) {
	            double emi = loan.calculateEMI(
	                    applicant.getLoanAmount(),
	                    loan.interestRate,
	                    loan.termMonths
	            );
	            System.out.println("Loan Approved ✅");
	            System.out.println("Monthly EMI: ₹" + (int) emi);
	        } else {
	            System.out.println("Loan Rejected ❌");
	        }
	    }
	}



