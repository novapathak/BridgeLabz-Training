package com.bridgelabz.stackqueue.subarray;

import java.util.HashMap;

class ZeroSumSubarray {

    static void findZeroSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == 0 || map.containsKey(sum)) {
                System.out.println("Zero sum subarray found");
            }
            map.put(sum, i);
        }
    }
}
