// Create a Method to check for Spring season and return a boolean true or false 
public class SpringSeason {
    // Main method
    public static void main(String[] args) {

        // Taking month and day from command line arguments
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        // Calling method 
        boolean result = isSpringSeason(month, day);

        // Print result 
        if (result) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
	//Method
    public static boolean isSpringSeason(int month, int day) {

        // Check for March 
        if (month == 3 && day >= 20) {
            return true;
        }
        // Check for April and May 
        else if (month == 4 || month == 5) {
            return true;
        }
        // Check for June 
        else if (month == 6 && day <= 20) {
            return true;
        }
        
        else {
            return false;
        }
    }
}
