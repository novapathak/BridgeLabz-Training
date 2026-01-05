package com.bridgelabz.linkedlist.task;

public class TaskMain {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addTask(1, "Coding", 1);
        scheduler.addTask(2, "Testing", 2);

        scheduler.displayTasks();
    }
}
