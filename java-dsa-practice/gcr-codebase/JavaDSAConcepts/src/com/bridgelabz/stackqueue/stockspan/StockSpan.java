package com.bridgelabz.stackqueue.stockspan;

import java.util.Stack;

class StockSpan {

    static void calculateSpan(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        System.out.println("1");

        for (int i = 1; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            int span = stack.isEmpty() ? i + 1 : i - stack.peek();
            System.out.println(span);

            stack.push(i);
        }
    }
}
