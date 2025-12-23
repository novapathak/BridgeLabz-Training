import java.util.Scanner;
public class StringIndexOut{
	
	public static void genrateException(String t){
		char ch = t.charAt(t.length()); 
        System.out.println("Character: " + ch);
	}

	public static void handleException(String t){
		try {
		// Accessing index beyond string length
		char ch = text.charAt(text.length());
		System.out.println("Character: " + ch);
	 }
	    catch (StringIndexOutOfBoundsException e) {
		// Exception is handled here
		System.out.println("Exception Caught: String index is out of range");
	}
		
	}
	
	
	public static void main(string[] args){
		
		//Create scanner object to take input
		Scanner sc = new Scanner(System.in);
		
		//Take input from user
		System.out.println("Enter a text: ");
		String text = sc.nextLine();
		
		// Call Method
		genrateException(text);
		handleException();
	}
	}
		