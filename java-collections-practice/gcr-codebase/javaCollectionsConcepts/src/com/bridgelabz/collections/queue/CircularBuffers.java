package com.bridgelabz.collections.queue;
class CircularBuffer {
    int[] arr;
    int front = 0;
    int rear = 0;
    int size = 0;
    int capacity;

    CircularBuffer(int cap) {
        capacity = cap;
        arr = new int[cap];
    }

    public void insert(int x) {
        arr[rear] = x;

        rear = (rear + 1) % capacity;

        if (size == capacity) {
            front = (front + 1) % capacity;
        } else {
            size++;
        }
    }

    public void printBuffer() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(front + i) % capacity] + " ");
        }
        System.out.println();
    }
}

public class CircularBuffers {
    public static void main(String[] args) {
        CircularBuffer cb = new CircularBuffer(3);

        cb.insert(1);
        cb.insert(2);
        cb.insert(3);
        cb.printBuffer();
        cb.insert(4);     
        cb.printBuffer(); 
    }
}


