package com.bridgelabz.multithreading.printshop;

public class PrintJob implements Runnable {

    private String jobName;
    private int pages;

    public PrintJob(String jobName, int pages) {
        this.jobName = jobName;
        this.pages = pages;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= pages; i++) {
                Thread.sleep(100);
                System.out.println("Printing "
                        + jobName + " - Page "
                        + i + " of " + pages);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
