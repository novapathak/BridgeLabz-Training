package com.bridgelabz.stackqueue.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

class SlidingWindowMax {

    static void findMax(int[] arr, int k) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Remove elements outside window
            if (!dq.isEmpty() && dq.peek() <= i - k) {
                dq.poll();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            if (i >= k - 1) {
                System.out.println(arr[dq.peek()]);
            }
        }
    }
}
