package com.bridgelabz.linkedlist.task;

class TaskNode {
    int id;
    String name;
    int priority;
    TaskNode next;

    TaskNode(int id, String name, int priority) {
        this.id = id;
        this.name = name;
        this.priority = priority;
    }
}
