package com.bridgelabz.sorting.countingsort;

class CountingSortMain {

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 14, 18, 11, 13};

        CountingSortStudentAges.countingSort(ages);

        System.out.println("Sorted Student Ages:");
        for (int a : ages) {
            System.out.print(a + " ");
        }
    }
}
