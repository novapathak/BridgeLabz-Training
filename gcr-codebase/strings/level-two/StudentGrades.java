import java.util.Scanner;
public class StudentGrades {
	
	//Method
    public int[][] generateMarks(int n) {
        int[][] marks = new int[n][3];
        for(int i=0; i<n; i++) {
            for(int j=0; j<3; j++) marks[i][j] = (int)(Math.random()*50) + 50;
        }
        return marks;
    }
    public String calculateGrade(double percentage) {
        if(percentage >= 80) return "A";
        if(percentage >= 70) return "B";
        if(percentage >= 60) return "C";
        if(percentage >= 50) return "D";
        if(percentage >= 40) return "E";
        return "R";
    }

    public static void main(String[] args) {
		
		//Create scanner object to take input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        StudentGrades grader = new StudentGrades();
        int[][] marks = grader.generateMarks(n);

        System.out.println("Phy\tChem\tMath\tAvg\tGrade");
        for(int[] student : marks) {
            double total = student[0] + student[1] + student[2];
            double avg = total / 3.0;
            System.out.printf("%d\t%d\t%d\t%.2f\t%s\n", student[0], student[1], student[2], avg, grader.calculateGrade(avg));
        }
        sc.close();
    }
}