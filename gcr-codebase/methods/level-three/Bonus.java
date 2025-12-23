// Create class Bonus that calculates employee bonuses based on their salary and years of service.

import java.util.Scanner;
public class Bonus {

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] employeeData) {

        // empData[i][0] = salary, empData[i][1] = years
        double[][] results = new double[employeeData.length][2];
        
        // Calculate bonus and new salary
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusPercentage = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercentage;
            
            results[i][1] = bonus;
            results[i][0] = salary + bonus;
        }
        return results;
    }

    public static void main(String[] args) {

        // Create Scanner object for input
        Scanner sc = new Scanner(System.in);
        double[][] employeeData = new double[10][2];

        // Generate Random Data
        for (int i = 0; i < 10; i++) {
            employeeData[i][0] = (int)(Math.random() * 90000) + 10000; 
            employeeData[i][1] = (int)(Math.random() * 10) + 1; 
        }

        // Calculate bonuses
        double[][] results = calculateBonus(employeeData);

        // Display results
        double totalOld = 0, totalNew = 0, totalBonus = 0;
        System.out.println("ID\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", (i+1), employeeData[i][0], employeeData[i][1], results[i][1], results[i][0]);
            totalOld += employeeData[i][0];
            totalBonus += results[i][1];
            totalNew += results[i][0];
        }
        System.out.println("------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t%.2f\t%.2f\n", totalOld, totalBonus, totalNew);

        
        sc.close();
    }
}