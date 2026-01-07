package com.bridgelabz.sorting.heapsort;

class HeapSortMain {

    public static void main(String[] args) {
        int[] salaries = {50000, 70000, 45000, 90000, 60000};

        HeapSortSalaries.heapSort(salaries);

        System.out.println("Sorted Salary Demands:");
        for (int s : salaries) {
            System.out.print(s + " ");
        }
    }
}
