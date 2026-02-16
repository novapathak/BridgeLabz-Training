package com.bridgelabz.runtimeanalysibigonotation;

import java.util.Arrays;
import java.util.Random;

public class SortingComparison {

    // Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    public static void main(String[] args) {

        int size = 10_000;
        int[] arr1 = new Random().ints(size, 0, size).toArray();
        int[] arr2 = Arrays.copyOf(arr1, size);
        int[] arr3 = Arrays.copyOf(arr1, size);

        
        long start = System.nanoTime();
        bubbleSort(arr1);
        long end = System.nanoTime();
        System.out.println("Bubble Sort Time: " + (end - start) / 1_000_000.0 + " ms");

      
        start = System.nanoTime();
        Arrays.sort(arr2);
        end = System.nanoTime();
        System.out.println("Merge/Tim Sort Time: " + (end - start) / 1_000_000.0 + " ms");

      
        start = System.nanoTime();
        Arrays.parallelSort(arr3);
        end = System.nanoTime();
        System.out.println("Parallel Quick Sort Time: " + (end - start) / 1_000_000.0 + " ms");
    }
}
