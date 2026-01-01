package com.bridgelabz.objectmodelling.levelone;

public class UniversityDepartment {
    private String deptName;

    public UniversityDepartment(String deptName) {
        this.deptName = deptName;
    }

    public void displayDepartment() {
        System.out.println("Department: " + deptName);
    }
}
