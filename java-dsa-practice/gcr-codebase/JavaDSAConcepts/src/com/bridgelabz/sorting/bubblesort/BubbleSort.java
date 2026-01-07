package com.bridgelabz.sorting.bubblesort;

class BubbleSort {

    public static void bubbleSort(int[] marks) {
        int n = marks.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] marks = {78, 45, 89, 62, 90};

        bubbleSort(marks);

        System.out.println("Sorted Student Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
