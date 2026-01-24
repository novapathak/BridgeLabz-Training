package com.bridgelabz.dsa.day07.eduresult;
import java.util.ArrayList;
public class Sorting {
	
	public static void sorting(ArrayList<Student>arr,  int start, int end) {
		if(start < end) {
			
			int mid = (start + (end-start)/2);
			
			sorting(arr, start, mid);
			sorting(arr, mid+1, end);
			
			Merge.merge(arr, start, mid, end);
			
			
		}
	}
	}


