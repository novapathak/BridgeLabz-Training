import java.util.*;
public class ReservationQueue{
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
	    int totalSeats = 5 ;
		int choice ;
		while(true){
			if(totalSeats == 0){
				System.out.println("No available seats ! ");
				break;
			}
		
		//Show menu to user
		System.out.println("Train reservation menu: ");
		System.out.println(" 1. Book Ticket");
		System.out.println(" 2. Check Availability");
		System.out.println(" 3. Exit");
		System.out.println("Enter your choice: ");
		
		choice = sc.nextInt();
		
		switch(choice){
			case 1:
				System.out.println("Ticket Booked");
				totalSeats--;
				System.out.println("Seats remaining = " + totalSeats);
				break;
				
			case 2:
				System.out.println(" Available Seats: " + totalSeats);
				break;

			case 3:
				System.out.println(" Thank you for using Train Reservation System.");
				return;
				
			default:
				System.out.println(" Invalid choice. Try again.");
            }
        }

        sc.close();
    }
}