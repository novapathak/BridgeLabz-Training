package com.bridgelabz.inheritance;

public class CourseMain{

    public static void main(String[] args) {

        Course course = new PaidOnlineCourse(
                "Java Full Stack",
                120,
                "Udemy",
                true,
                15000,
                20
        );

        course.displayDetails(); // Runtime Polymorphism
    }
}
