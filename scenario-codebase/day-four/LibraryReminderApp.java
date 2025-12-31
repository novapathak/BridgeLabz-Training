import java.util.Scanner;

public class LibraryReminderApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int totalFine = 0;

        // loop for 5 books
        for (int book = 1; book <= 5; book++) {

            System.out.println("\n Book " + book);

            System.out.print("Enter due date (day number): ");
            int dueDate = sc.nextInt();

            System.out.print("Enter return date (day number): ");
            int returnDate = sc.nextInt();

            // check if returned late
            if (returnDate > dueDate) {
                int lateDays = returnDate - dueDate;
                int fine = lateDays * 5;
                totalFine += fine;

                System.out.println("Late by " + lateDays + " days");
                System.out.println("Fine: ₹" + fine);
            } else {
                System.out.println("Returned on time. No fine ");
            }
        }

        System.out.println("\n Total Fine for all books: ₹" + totalFine);
        sc.close();
    }
}
