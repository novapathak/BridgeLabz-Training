package com.bridgelabz.day07.medistore;

import java.time.LocalDate;

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public boolean checkExpiry() {
        // Injections are sensitive – expire 15 days earlier
        return LocalDate.now().isAfter(expiryDate.minusDays(15));
    }
}

