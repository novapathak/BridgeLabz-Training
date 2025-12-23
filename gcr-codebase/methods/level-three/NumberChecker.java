// Create a NumberChecker utility class and perform following task
import java.util.Scanner;
public class NumberChecker{
public static void main(String[] args){
	
	//Create Scanner object
	Scanner sc = new Scanner(System.in);
	
	//Take input from user
	System.out.println("Enter a number: ");
	int number = sc.nextInt();
	
	//Calling method
	int count = countDigit(number);
	int[] digitArr = digitArr(number,count);
	boolean duckNumber = duckNumber(number);
	boolean armstrong = armstrongNumber(digitArr,count, number);
	int[] largest = largestNumber(digitArr,count);
	int[] smallest = smallestNumber(digitArr,count);
	
	//print result
	System.out.println("The count of digits in the number is: "+count);
	System.out.println("Is number is a duck number? "+ duckNumber);
	System.out.println("Is number is armstrong number? "+armstrong);
	System.out.println("The largest and second largest number is: "+largest[0] + "\t" + largest[1]);
	System.out.println("The smallest and second smallest number is: " + smallest[0] + "\t" + smallest[1]);
}

//Count total digits in number
public static int countDigit(int number){
	int num = number;
	int count = 0;
	while(num!=0){
		num = num/10;
		count++;
	}
	return count;
}

//store digits in array
public static int[] digitArr(int number, int count){
	int[] digitArr = new int [count];
	int num = number;
	for(int i=0; i<count; i++ ){
		int store = num%10;
		digitArr[i] = store;
		num = num/10;
	}
	return digitArr;
}

//Check if number is duck number or not
public static boolean duckNumber(int number){
    String temp = Integer.toString(number);
	if(temp.charAt(0)=='0'){
		return false;
	}
	else{
		return true;
	}
}


//check if number is armstrong number or not
public static boolean armstrongNumber(int[] digitArr, int count, int number){
	int sum = 0;
	for(int i=0; i<count; i++){
		sum += Math.pow(digitArr[i],count);
	}
	if(sum==number){
		return true;
	}
	else{
		return false;
	}
}
// check the largest and second largest number
public static int[] largestNumber(int[]digitArr,int count){
	int secondL = Integer.MIN_VALUE;
	int large = digitArr[0];
	
	for(int i=1; i<count; i++){
	    if(digitArr[i]>large){
			secondL = large;
			large = digitArr[i];
		}
	}
		int[] result = new int [2];
		result[0] = large;
		result[1] = secondL;
	return result;
	}
	
//check the smallest and second smallest number
public static int[] smallestNumber(int[]digitArr,int count){
	int secondS = Integer.MAX_VALUE;
	int small = digitArr[0];

	for(int i=1; i<count; i++){
		if(digitArr[i]<small){
			secondS = small;
			small = digitArr[i];
		}
	}
	int[] result = new int [2];
	result[0] = small;
	result[1] = secondS;
	return result;
}
}
	
	

		 
			


			 
			

  		
	


		
		

	  

	