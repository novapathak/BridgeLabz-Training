package com.bridgelabz.stackqueue.twosum;

import java.util.HashMap;

class TwoSum {

    static void findIndices(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int needed = target - arr[i];
            if (map.containsKey(needed)) {
                System.out.println(map.get(needed) + " , " + i);
                return;
            }
            map.put(arr[i], i);
        }
    }
}
