package com.bridgelabz.objectmodelling.levelone;

public class UniversityMain {
    public static void main(String[] args) {

        Faculty f1 = new Faculty("Dr. Sharma");
        Faculty f2 = new Faculty("Dr. Mehta");

        University uni = new University("ABC University");

        uni.addDepartment("Computer Science");
        uni.addDepartment("Mechanical");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.displayUniversity();

        // University destroyed → Departments destroyed
        uni = null;

        // Faculty still exists
        f1.displayFaculty();
    }
}
