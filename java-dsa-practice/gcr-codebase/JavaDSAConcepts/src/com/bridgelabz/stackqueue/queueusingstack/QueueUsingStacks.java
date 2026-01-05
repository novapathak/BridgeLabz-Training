package com.bridgelabz.stackqueue.queueusingstack;

import java.util.Stack;

class QueueUsingStacks {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    // Add element to queue
    void enqueue(int data) {
        stack1.push(data);
    }

    // Remove element from queue
    int dequeue() {
        if (stack2.isEmpty()) {
            // Move all elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        if (stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        return stack2.pop();
    }
}
