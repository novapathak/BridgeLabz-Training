package com.bridgelabz.dsa.reviewquestion;
import java.util.*;
public class BubbleSort {
	public static void main(String[]args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number of element");
		int n = sc.nextInt();
		int []arr	= new int[n];
		//int [] arr = {32,54,67,90,87,21};
		for(int i =0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		for(int i = 0;i<arr.length-1;i++) {
			for(int j = 0; j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]= arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
