package com.bridgelabz.stackqueue.hashmap;

class CustomHashMap {

    class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 10;
    private Node[] table = new Node[SIZE];

    void put(int key, int value) {
        int index = key % SIZE;
        Node node = new Node(key, value);

        if (table[index] == null) {
            table[index] = node;
        } else {
            Node temp = table[index];
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    Integer get(int key) {
        int index = key % SIZE;
        Node temp = table[index];

        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return null;
    }
}
