package com.bridgelabz.sorting.selectionsort;

class SelectionSortMain {

    public static void main(String[] args) {
        int[] scores = {88, 72, 95, 60, 83};

        SelectionSortExamScores.selectionSort(scores);

        System.out.println("Sorted Exam Scores:");
        for (int s : scores) {
            System.out.print(s + " ");
        }
    }
}
