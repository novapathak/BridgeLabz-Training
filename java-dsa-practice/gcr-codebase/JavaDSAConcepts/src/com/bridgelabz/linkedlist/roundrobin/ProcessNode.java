package com.bridgelabz.linkedlist.roundrobin;

class ProcessNode {
    int pid, burstTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime) {
        this.pid = pid;
        this.burstTime = burstTime;
    }
}
