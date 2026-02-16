package com.bridgelabz.multithreading.threadstatemonitoring;


public class StateMonitor extends Thread {

    private Thread t1;
    private Thread t2;

    public StateMonitor(Thread t1, Thread t2) {
        this.t1 = t1;
        this.t2 = t2;
    }

    @Override
    public void run() {

        try {
            while (true) {

                System.out.println("[Monitor] "
                        + t1.getName() + " : "
                        + t1.getState());

                System.out.println("[Monitor] "
                        + t2.getName() + " : "
                        + t2.getState());

                if (t1.getState() == State.TERMINATED &&
                        t2.getState() == State.TERMINATED) {
                    break;
                }

                Thread.sleep(500);
            }

            System.out.println("Monitoring completed.");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
