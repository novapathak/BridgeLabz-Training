import java.util.Scanner;
public class SubString{
	
	// generate substring using char At function
	public static String stringUsingCharAt(String t, int s, int e){
		String result = "";
		for(int i = s; i < e; i++){
			result += t.charAt(i);
		}
		return result;
	}
	
	// generate substring using built in function
	public static String stringBuiltIn(String t, int s, int e){
		String res = t.substring(s,e);
	return res;
}
	//Comapre both the string
    public static boolean compareString(String s1, String s2){
		if(s1.equals(s2)){
		return true;
	}
	else{
		return false;
	}
}

	//Main method
	public static void main(String[] args){
		
		//Create scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//Take input
		System.out.println("Enter text: ");
		String text = sc.nextLine();
		
		System.out.println("Enter start: ");
		int start = sc.nextInt();
		
		System.out.println("Enter end: ");
		int end = sc.nextInt();
		
	    String string1 = stringUsingCharAt(text, start, end); 
	    String string2 = stringBuiltIn(text, start, end); 
		boolean answer = compareString(string1, string2);
		
		//Print result
		System.out.println(string1);
		System.out.println(string2);
		System.out.println("Is both the substring are same? "+answer);


	}
}