//Create method to check if a student can vote
import java.util.Scanner;
public class StudentVoteChecker {
	
//mthod to check eligibility
 public boolean canStudentVote(int age) {
      if (age < 0) {
            return false;
        }
        if (age >= 18) {
            return true;
        }
        return false;
    }
//Main method
    public static void main(String[] args) {
    //Create scanner object
        Scanner sc = new Scanner(System.in);
        StudentVoteChecker checker = new StudentVoteChecker();
       int[] ages = new int[10];
 	   for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();

            if (checker.canStudentVote(ages[i])) {
                System.out.println("Can Vote");
            } else {
                System.out.println("Cannot Vote");
            }
        }
    }
}
