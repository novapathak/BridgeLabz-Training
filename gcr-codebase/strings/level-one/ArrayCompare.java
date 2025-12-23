import java.util.Scanner;

public class ArrayCompare {

    // Method to return characters of a string without using toCharArray
    public static char[] getCharacters(String text) {
       
        char[] chars = new char[text.length()];
        // Store each character using charAt()
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }
    // Method 
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
		
        if (arr1.length != arr2.length) {
            return false;
        }
        // Compare each character
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true; 
    }
    public static void main(String[] args) {
		//Create scanner object to take input
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter the text: ");
        String input = sc.next();
		
        char[] userArray = getCharacters(input);
        char[] builtInArray = input.toCharArray();

        // Compare both arrays
        boolean result = compareCharArrays(userArray, builtInArray);
        System.out.print("\nCharacters from user-defined method: ");
        for (char ch : userArray) {
            System.out.print(ch + " ");
        }
        // Display result
        System.out.println("\n\nAre both character arrays same? " + result);

        sc.close();
    }
}
