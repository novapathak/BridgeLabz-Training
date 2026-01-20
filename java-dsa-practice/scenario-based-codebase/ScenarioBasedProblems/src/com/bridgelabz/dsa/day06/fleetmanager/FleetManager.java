package com.bridgelabz.dsa.day06.fleetmanager;

class FleetManager {
    void mergeSort(Vehicle[] vehicles, int left, int right) {
        if (left<right) {
            int mid = (left +right)/2;
            mergeSort(vehicles, left, mid);
            mergeSort(vehicles, mid+1, right);
            merge(vehicles, left, mid, right);
        }
    }
    void merge(Vehicle[] vehicles, int left , int mid, int right) {
        int n1 =mid-left+1;
        int n2 =right-mid;
        Vehicle[] L = new Vehicle[n1];
        Vehicle[] R = new Vehicle[n2];
        for (int i = 0; i<n1; i++)
            L[i] = vehicles[left+i];
        for (int j=0;j<n2;j++)
            R[j] =vehicles[mid+1+j];
        int i = 0, j = 0, k = left;
        while (i<n1 &&j<n2) {
            if (L[i].mileage<= R[j].mileage) {
                vehicles[k]=L[i];
                i++;
            } else {
                vehicles[k]=R[j];
                j++;
            }
            k++;
        }
    while (i<n1) {
            vehicles[k] = L[i];
            i++;
            k++;
        }

    while (j<n2) {
            vehicles[k]=R[j];
            j++;
            k++;
        }
    }
    void display(Vehicle[] vehicles) {
        for (Vehicle v:vehicles) {
            System.out.print(v.mileage+ " ");
        }
        System.out.println();
    }
}
