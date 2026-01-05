package com.bridgelabz.day01.ewallet;

class User implements Transferrable {
    String name;
    Wallet wallet;

    User(String name, double balance) {
        this.name = name;
        wallet = new Wallet(balance);
    }

    public void transferTo(User receiver, double amount) {
        if (wallet.deduct(amount)) {
            receiver.wallet.addMoney(amount);
            System.out.println("Transfer successful");
        } else {
            System.out.println("Insufficient balance");
        }
    }
}
