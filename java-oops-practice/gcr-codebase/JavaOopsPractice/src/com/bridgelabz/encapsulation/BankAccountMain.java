package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class BankAccountMain {

    public static void main(String[] args) {

        List<BankAccount> accounts = new ArrayList<>();

        accounts.add(new SavingsAccount("SA101", "Rohit", 50000));
        accounts.add(new CurrentAccount("CA202", "Anita", 100000));

        for (BankAccount account : accounts) {

            account.displayAccountDetails();

            double interest = account.calculateInterest();
            System.out.println("Interest Earned : ₹" + interest);

            account.deposit(5000);
            account.withdraw(3000);

            if (account instanceof Loanable) {
                Loanable loan = (Loanable) account;
                loan.applyForLoan();
                System.out.println("Loan Eligibility : ₹" + loan.calculateLoanEligibility());
            }

            System.out.println("----------------------------------");
        }
    }
}
