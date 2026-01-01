package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;

public class University {

    private String universityName;
    private ArrayList<Department> departments;
    private ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    // Composition: Department cannot exist without University
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: Faculty can exist independently
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.showDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
    }
}
