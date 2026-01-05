package com.bridgelabz.linkedlist.roundrobin;

class RoundRobin {
    ProcessNode head = null;

    void addProcess(int pid, int burst) {
        ProcessNode node = new ProcessNode(pid, burst);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    void schedule(int timeQuantum) {
        ProcessNode temp = head;

        while (true) {
            boolean done = true;

            do {
                if (temp.burstTime > 0) {
                    done = false;
                    if (temp.burstTime > timeQuantum) {
                        temp.burstTime -= timeQuantum;
                        System.out.println("Process " + temp.pid + " executed for " + timeQuantum);
                    } else {
                        System.out.println("Process " + temp.pid + " finished");
                        temp.burstTime = 0;
                    }
                }
                temp = temp.next;
            } while (temp != head);

            if (done) break;
        }
    }
}
