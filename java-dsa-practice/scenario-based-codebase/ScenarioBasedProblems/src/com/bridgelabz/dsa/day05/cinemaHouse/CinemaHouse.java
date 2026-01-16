package com.bridgelabz.dsa.day05.cinemaHouse;

class CinemaHouse {

    public static void main(String[] args) {

        int[] arr = {1800, 1400, 2100, 1200, 1600};

        // Bubble Sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                   arr[j] = arr[j + 1];
                   arr[j + 1] = temp;
                }
            }
        }

       
        System.out.println("Sorted Movie Show Times:");
        for (int time : arr) {
            System.out.println(time);
        }
    }
}
