package com.bridgelabz.stackqueue.pairsum;

import java.util.HashMap;

class PairSum {

    static boolean hasPair(int[] arr, int target) {
        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(target - num)) {
                return true;
            }
            map.put(num, true);
        }
        return false;
    }
}
