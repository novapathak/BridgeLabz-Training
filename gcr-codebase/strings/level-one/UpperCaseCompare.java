import java.util.Scanner;

public class UpperCaseCompare {

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String convertToUpperCase(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase letter
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase to uppercase using ASCII difference (32)
