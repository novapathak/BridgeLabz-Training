package com.bridgelabz.constructor;
class Course {

    // instance variables
    String courseName;
    int duration;
    double fee;

    // class variable
    static String instituteName = "ABC Institute";

    // constructor
    Course(String c, int d, double f) {
        courseName = c;
        duration = d;
        fee = f;
    }

    // instance method
    void displayCourseDetails() {
        System.out.println(courseName + " " + duration + " " + fee + " " + instituteName);
    }

    // class method to change institute name
    static void updateInstituteName(String name) {
        instituteName = name;
    }

    public static void main(String[] args) {
        Course c1 = new Course("Java", 3, 15000);
        c1.displayCourseDetails();
        Course.updateInstituteName("XYZ Institute");
        c1.displayCourseDetails();
    }
}
