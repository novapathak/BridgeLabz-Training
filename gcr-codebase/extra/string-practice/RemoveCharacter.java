import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {

         // Scanner object to take input from user
		 Scanner sc = new Scanner(System.in);
		
        String str = sc.nextLine();
        char remove = sc.next().charAt(0);
        String result = "";
        // Loop through string
        for (int i = 0; i < str.length(); i++) {

            // Skip the character to remove
            if (str.charAt(i) != remove)
                result += str.charAt(i);
        }
        System.out.println("Modified String: " + result);
    }
}
