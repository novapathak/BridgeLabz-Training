package com.bridgelabz.sorting.quicksort;

public class QuickSortMain {

    public static void main(String[] args) {
        int[] prices = {999, 299, 799, 199, 499};

        QuickSortProductPrices.quickSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Product Prices:");
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}

