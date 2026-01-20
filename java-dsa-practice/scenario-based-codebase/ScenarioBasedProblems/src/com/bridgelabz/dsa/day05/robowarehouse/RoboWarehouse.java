package com.bridgelabz.dsa.day05.robowarehouse;

class RoboWarehouse {
    void insertionSort(PackageItem[] items) {

        for (int i=1;i<items.length;i++) {
            PackageItem key = items[i];
            int j=i-1;
            while (j>=0&&items[j].weight>key.weight) {
                items[j+1]=items[j];
                j--;
            }
            items[j+1]=key;
        }
    }
    void display(PackageItem[] items) {
        for (PackageItem p:items) {
            System.out.print(p.weight + " ");
        }
        System.out.println();
    }
}
