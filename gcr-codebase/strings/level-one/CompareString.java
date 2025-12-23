import java.util.Scanner;
public class CompareString{
	public static void main(String[] args){
		
		//Create scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//Decalre string to take input
		System.out.println("Enter first string: ");
		String name = sc.nextLine();
		System.out.println("Enter second string: ");
		String name1 = sc.nextLine();
		
		boolean result = compareWithCharAt(name, name1);
		System.out.println("Result of comparing using charAt is: "+result);
		
		boolean result2 = name.equals(name1);
		System.out.println("Result of comparing using in built function is: "+result2);
		
		//Comparing both results
		if(result == result2){
			System.out.println("Both methods give same result");
		}
		else{
			System.out.println("Both methods give different result");
		}
	}
		
	
	public static boolean compareWithCharAt(String n, String n1){
		
		//Check length first of both strings
		if( n.length() != n1.length()){
			return false;
		}
		
		// compare both strings
		for(int i=0; i<n.length(); i++){
			if(n.charAt(i)!=n1.charAt(i)){
				return false;
			}
		}
		return true;
	}
}


				
		