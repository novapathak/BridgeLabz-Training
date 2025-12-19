//Creating Class with name CalculateGrade
   
import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner sc = new Scanner(System.in);

        // Get marks for each subject
        System.out.print("Enter Physics marks: ");
        double physicsMarks = sc.nextDouble();

        System.out.print("Enter Chemistry marks: ");
        double chemistryMarks = sc.nextDouble();

        System.out.print("Enter Maths marks: ");
        double mathsMarks = sc.nextDouble();
        
        // Constants for total marks (assuming 100 per subject for percentage calculation)
        final double TotalMarks = 100.0;
        final int NumberOfSubject = 3;

        // Calculate total and percentage
        double totalMarks = physicsMarks + chemistryMarks + mathsMarks;
        double percentage = (totalMarks / (NumberOfSubject * TotalMarks)) * 100;

        // Variables for grade and remarks
        String grade;
        String remarks;

        // Determine grade based on percentage
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } else {
            grade = "R";
            remarks = "Remedial standards";
        }

        // Print results
        System.out.println("Average Mark/Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        
    }
}