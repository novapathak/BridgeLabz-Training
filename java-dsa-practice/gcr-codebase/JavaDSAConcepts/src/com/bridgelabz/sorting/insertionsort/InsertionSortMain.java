package com.bridgelabz.sorting.insertionsort;

class InsertionSortMain {

    public static void main(String[] args) {
        int[] ids = {104, 102, 109, 101, 106};

        InsertionSortEmployeeIDs.insertionSort(ids);

        System.out.println("Sorted Employee IDs:");
        for (int id : ids) {
            System.out.print(id + " ");
        }
    }
}

