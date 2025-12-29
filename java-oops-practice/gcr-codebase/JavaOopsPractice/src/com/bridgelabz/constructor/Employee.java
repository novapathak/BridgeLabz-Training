package com.bridgelabz.constructor;
class Employee {

    public int employeeID;        // public variable
    protected String department;  // protected variable
    private double salary;        // private variable

    // setter for salary
    public void setSalary(double s) {
        salary = s;
    }

    // getter for salary
    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {

    // display employee details
    void display() {
        System.out.println(employeeID + " " + department);
    }

    public static void main(String[] args) {
        Manager m = new Manager();
        m.employeeID = 201;
        m.department = "IT";
        m.setSalary(60000);

        m.display();
        System.out.println("Salary: " + m.getSalary());
    }
}
