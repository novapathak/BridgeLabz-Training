package com.bridgelabz.day08.skillforge;

class Course implements ICertifiable {
    private String title;
    private Instructor instructor;
    protected double rating;
    private String[] modules;

    public Course(String title, Instructor instructor) {
        this(title, instructor, new String[]{"Intro", "Basics"});
    }

    public Course(String title, Instructor instructor, String[] modules) {
        this.title = title;
        this.instructor = instructor;
        this.modules = modules;
    }

    protected void calculateRating(double feedback) {
        rating = feedback;
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate generated for course: " + title);
    }
}
