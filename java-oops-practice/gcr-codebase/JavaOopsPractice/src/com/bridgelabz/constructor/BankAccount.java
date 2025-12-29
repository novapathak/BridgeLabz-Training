package com.bridgelabz.constructor;
class BankAccount {

    public int accountNumber;        // public variable
    protected String accountHolder;  // protected variable
    private double balance;          // private variable

    // setter for balance
    public void setBalance(double b) {
        balance = b;
    }

    // getter for balance
    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {

    // display account details
    void display() {
        System.out.println(accountNumber + " " + accountHolder);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount();
        s.accountNumber = 111;
        s.accountHolder = "Ravi";
        s.setBalance(5000);

        s.display();
        System.out.println("Balance: " + s.getBalance());
    }
}
