package com.bridgelabz.sorting.countingsort;

class CountingSortStudentAges {

    public static void countingSort(int[] ages) {
        int min = 10;
        int max = 18;

        int[] count = new int[max - min + 1];

        for (int age : ages) {
            count[age - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }
    }

    public static void main(String[] args) {
        int[] ages = {12, 15, 10, 14, 18, 11, 13};

        countingSort(ages);

        System.out.println("Sorted Student Ages:");
        for (int age : ages) {
            System.out.print(age + " ");
        }
    }
}
