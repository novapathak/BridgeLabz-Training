//Creating Class with name DayWeek

import java.util.Scanner;

public class DayWeek {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get input 
        System.out.print("Enter month: ");
        int m = Integer.parseInt(args[0]);

        System.out.print("Enter day: ");
        int d = Integer.parseInt(args[1]);

        System.out.print("Enter year: ");
        int y = Integer.parseInt(args[2]);

        // Apply Gregorian calendar formulas
        // y0 = y - (14 - m) / 12
        int y0 = y - (14 - m) / 12;
        
        // x = y0 + y0/4 - y0/100 + y0/400
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        
        // m0 = m + 12 * ((14 - m) / 12) - 2
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        
        // d0 = (d + x + 31 * m0 / 12) % 7
        int d0 = (d + x + 31 * m0 / 12) % 7;

        // Print the result 
        System.out.println("The day of the week is: " + d0);
        
       
    }
}