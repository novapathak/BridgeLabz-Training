package com.bridgelabz.stackqueue.petrolpump;

class CircularTour {

    static int findStart(int[] petrol, int[] distance) {
        int surplus = 0, deficit = 0, start = 0;

        for (int i = 0; i < petrol.length; i++) {
            surplus += petrol[i] - distance[i];

            if (surplus < 0) {
                deficit += surplus;
                surplus = 0;
                start = i + 1;
            }
        }

        return (surplus + deficit >= 0) ? start : -1;
    }
}

