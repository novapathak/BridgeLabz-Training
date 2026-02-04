package com.bridgelabz.streams;

import java.time.*;
import java.util.*;

public class Timestamp {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TXN101", "TXN102");

        transactionIds.forEach(id ->
            System.out.println(
                "Transaction: " + id + " Time: " + LocalDateTime.now()
            )
        );
    }
}
