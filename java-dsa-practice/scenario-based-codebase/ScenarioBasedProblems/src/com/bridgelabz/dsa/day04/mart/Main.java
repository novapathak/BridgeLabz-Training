package com.bridgelabz.dsa.day04.mart;

public class Main {
    public static void main(String[] args) {

        Sale[] sales = {
            new Sale("2024-06-03", 500),
            new Sale("2024-06-01", 1200),
            new Sale("2024-06-02", 800),
            new Sale("2024-06-01", 300)
        };

        ZipZipMart mart = new ZipZipMart();

        System.out.println("Before Sorting:");
        mart.display(sales);

        mart.mergeSort(sales, 0, sales.length - 1);

        System.out.println("\nAfter Sorting by Date:");
        mart.display(sales);
    }
}
