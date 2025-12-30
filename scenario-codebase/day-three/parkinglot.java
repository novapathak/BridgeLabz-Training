import java.util.Scanner;

public class Parkinglot {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSlots = 5;   // total parking capacity
        int occupiedSlots = 0; // currently parked cars
        int choice;

        // while loop runs until parking is full OR user exits
        while (true) {

            // Stop if parking lot is full
            if (occupiedSlots == totalSlots) {
                System.out.println("Parking Lot is Full ");
                break;
            }

            // Menu options
            System.out.println("\n--- Parking Lot Menu ---");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Exit Vehicle");
            System.out.println("3. Show Occupancy");
            System.out.println("4. Exit System");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            switch (choice) {

                case 1:
                    if (occupiedSlots < totalSlots) {
                        occupiedSlots++;
                        System.out.println("Vehicle parked successfully ");
                    }
                    break;

                case 2:
                    if (occupiedSlots > 0) {
                        occupiedSlots--;
                        System.out.println("Vehicle exited successfully ");
                    } else {
                        System.out.println("No vehicles to exit ");
                    }
                    break;

                case 3:
                    // Show parking status
                    System.out.println("Occupied Slots: " + occupiedSlots);
                    System.out.println("Available Slots: " + (totalSlots - occupiedSlots));
                    break;

                case 4:
                    // Exit system
                    System.out.println("Thank you! Exiting Parking System 👋");
                    return;

                default:
                    System.out.println("Invalid choice! Please try again ⚠️");
            }
        }

        sc.close();
    }
}
