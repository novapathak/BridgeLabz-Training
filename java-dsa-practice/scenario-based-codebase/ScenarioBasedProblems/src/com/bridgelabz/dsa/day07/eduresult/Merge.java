package com.bridgelabz.dsa.day07.eduresult;
import java.util.ArrayList;
public class Merge {
	
	public static void merge (ArrayList<Student>arr, int start, int mid, int end ) {
		
		int i = start;
		int j = mid+1;
		
		ArrayList<Student>temp = new ArrayList<>();
		
	  while(i <= mid && j <= end) {
		  if(arr.get(i).getMarks() > arr.get(j).getMarks()) {
			  temp.add(arr.get(i));
			  i++;
		  }
		  else {
			  temp.add(arr.get(j));
			  j++;
		  }
	  }
	  while (i <= mid) {
          temp.add(arr.get(i));
          i++;
      }

      while (j <= end) {
          temp.add(arr.get(j));
          j++;
      }

	for(int index = 0; index < temp.size(); index++) {
		arr.set(start + index, temp.get(index));
	}

}
}
