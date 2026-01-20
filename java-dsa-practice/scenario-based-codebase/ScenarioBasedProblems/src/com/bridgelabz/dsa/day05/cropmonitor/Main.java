package com.bridgelabz.dsa.day05.cropmonitor;

public class Main {
	
	    public static void main(String[] args) {
	        SensorData[] data = { new SensorData(50),
	        		new SensorData(10),
	            new SensorData(40),
	            new SensorData(20)
	        };
	        CropMonitor cm = new CropMonitor();
	        System.out.println("Before Sorting:");
	        cm.display(data);

	        cm.quickSort(data,0,data.length-1);
	        System.out.println("After Sorting:");
	        cm.display(data);
	    }
	}



