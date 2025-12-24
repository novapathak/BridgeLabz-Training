import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {

	  // Scanner object to take input from user
	  Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int i = 0;
        // Compare character by character
        while (i < s1.length() && i < s2.length()) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (s1.charAt(i) < s2.charAt(i))
                    System.out.println(s1 + " comes before " + s2);
                else
                    System.out.println(s2 + " comes before " + s1);
                return;
            }
            i++;
        }
        // If all characters are equal
        if (s1.length() == s2.length())
            System.out.println("Both strings are equal");
        else if (s1.length() < s2.length())
            System.out.println(s1 + " comes before " + s2);
        else
            System.out.println(s2 + " comes before " + s1);
    }
}
