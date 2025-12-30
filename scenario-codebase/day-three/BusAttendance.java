import java.util.Scanner;

public class BusAttendance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] students = {"Alice", "Bob", "Charlie", "David", "Eva", "Frank", "Grace", "Hannah", "Ian", "Jack"};
        int presentCount = 0;
        int absentCount = 0;

        for (String student : students) {
            System.out.print("Is " + student + " Present or Absent? : ");
            String status = sc.next();

            if (status.equalsIgnoreCase("P")) {
                presentCount++;
            } else if (status.equalsIgnoreCase("A")) {
                absentCount++;
            } else {
                System.out.println("Invalid input, counting as Absent.");
                absentCount++;
            }
        }

        System.out.println("Total Present: " + presentCount);
        System.out.println("Total Absent: " + absentCount);

        sc.close();
    }
}
