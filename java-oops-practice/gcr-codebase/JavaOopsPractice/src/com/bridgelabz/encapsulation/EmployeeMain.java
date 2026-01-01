package com.bridgelabz.encapsulation;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain  {

    public static void main(String[] args) {

        // Polymorphism: Employee reference
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Amit", 50000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Ravi", 80, 300);

        employees.add(e1);
        employees.add(e2);

        // Processing list using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();

            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println("Department  : " + dept.getDepartmentDetails());
            }

            System.out.println("---------------------------");
        }
    }
}
