import java.util.Scanner;
 
class SamAverageMarks {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        // get student score from the user
        System.out.println("Enter grade");
        int studentGrade = input.nextInt();
 
        // condition for invalid score
        if (studentGrade < 0 || studentGrade > 100) {
            System.err.println("Invalid grade.");
            System.exit(0);
        }

        // if studentGrade is 50 or above, display pass and congratulatory 
        // message else display failed message
        if (studentGrade >= 50) {            
            System.out.println("Congratulations!");
            System.out.println("You passed the examination.");
        } else {
            System.out.println("Sorry.\nYou failed the examination.");
        }
        input.close();
    }
}
