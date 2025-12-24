import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {

         // Scanner object to take input from user
		 Scanner sc = new Scanner(System.in);
		
        String str = sc.nextLine();
        char mostChar = str.charAt(0);
        int maxCount = 0;

        // Outer loop for each character
        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            // Inner loop to count frequency
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j))
                    count++;
            }
            // Update most frequent character
            if (count > maxCount) {
                maxCount = count;
                mostChar = str.charAt(i);
            }
        }
        System.out.println("Most Frequent Character: " + mostChar);
    }
}
