package com.bridgelabz.collectors;

import java.util.*;
import java.util.stream.*;

class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }
}

public class Salary {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee("Nova", "IT", 50000),
            new Employee("Adarsh", "HR", 40000),
            new Employee("Kartik", "IT", 60000),
            new Employee("Riya", "HR", 45000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));

        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " Average Salary: " + avg)
        );
    }
}
