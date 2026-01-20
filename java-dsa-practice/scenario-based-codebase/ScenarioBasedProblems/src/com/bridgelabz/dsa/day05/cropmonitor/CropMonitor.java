package com.bridgelabz.dsa.day05.cropmonitor;

public class CropMonitor {
    void quickSort(SensorData[] data, int low, int high) {
        if (low<high) {
            int p = partition(data, low, high);
            quickSort(data, low, p-1);
            quickSort(data, p+1, high);
        }
    }
    int partition(SensorData[] data, int low, int high) {
        int pivot=data[high].time;
        int i=low-1;

        for (int j=low;j<high;j++) {
            if (data[j].time<pivot) {
                i++;
                SensorData temp = data[i];
                data[i]=data[j];
                data[j]=temp;
            }
        }
        SensorData temp = data[i+1];
        data[i+1] = data[high];
        data[high] = temp;
        return i+1;
    }
    void display(SensorData[] data) {
        for (SensorData s:data) {
            System.out.print(s.time + " ");
        }
        System.out.println();
    }
}
