package com.bridgelabz.sorting.bubblesort;

class BubbleSortMain {

    public static void main(String[] args) {
        int[] marks = {78, 45, 89, 62, 90};

        BubbleSort.bubbleSort(marks);

        System.out.println("Sorted Student Marks:");
        for (int m : marks) {
            System.out.print(m + " ");
        }
    }
}
