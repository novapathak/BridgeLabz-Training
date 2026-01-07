package com.bridgelabz.sorting.mergesort;

class MergeSortMain {

    public static void main(String[] args) {
        int[] prices = {450, 1200, 299, 800, 650};

        MergeSortBookPrices.mergeSort(prices, 0, prices.length - 1);

        System.out.println("Sorted Book Prices:");
        for (int p : prices) {
            System.out.print(p + " ");
        }
    }
}
