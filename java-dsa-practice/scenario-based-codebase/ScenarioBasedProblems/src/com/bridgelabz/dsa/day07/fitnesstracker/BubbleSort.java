package com.bridgelabz.dsa.day07.fitnesstracker;

public class BubbleSort {
	public static void bubbleSort(int n, int[] arr, String[] user) {
		
		for(int i = 0; i<n-1; i++) {
			for(int j = 0; j <n-1 - i; j++) {
				 if(arr[j]<arr[j+1]) {
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;	
					 
					 String tempUser = user[j];
					 user[j] = user[j+1];
					 user[j+1] = tempUser;
					 
				 }
			}
		}	
	}
}
