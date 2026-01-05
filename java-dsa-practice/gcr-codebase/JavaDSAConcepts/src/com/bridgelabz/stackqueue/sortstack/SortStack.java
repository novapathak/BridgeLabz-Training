package com.bridgelabz.stackqueue.sortstack;

import java.util.Stack;

class SortStack {

    // Sort stack
    static void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insertInSortedOrder(stack, temp);
        }
    }

    // Insert element in correct position
    static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(temp);
    }
}

