package com.bridgelabz.day01.ewallet;

public class WalletMain {
    public static void main(String[] args) {
        User u1 = new User("Amit", 1000);
        User u2 = new User("Ravi", 500);

        u1.transferTo(u2, 300);
        System.out.println(u1.wallet.getBalance());
        System.out.println(u2.wallet.getBalance());
    }
}
