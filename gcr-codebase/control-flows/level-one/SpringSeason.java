//Creating Class with name SpringSeason indicating the purpose is to 
//Check if the season is spring or not
import java.util.Scanner; 
public class SpringSeason {
    public static void main(String[] args) {
		
		//Create a scanner object
	    Scanner sc = new Scanner(System.in);

        //Display a message to the user
		System.out.println("Enter Month: ");
		
		//Taking Input from the user
        int month = sc.nextInt();
       
	    //Display a message to the user
		System.out.println("Enter Day: ");
	
	   //Taking Input from the user
	    int day = sc.nextInt();

        boolean isSpring = false;

        // Spring Season: March 20 to June 20
        if ((month == 3 && day >= 20) ||(month == 4) ||(month == 5) ||(month == 6 && day <= 20)) {
            isSpring = true;
        }

        // Output result
        if (isSpring) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
