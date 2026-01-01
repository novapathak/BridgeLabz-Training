package com.bridgelabz.inheritance;

public class Author extends Book {

    private String name;
    private String bio;

    // Constructor
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear); // call Book constructor
        this.name = name;
        this.bio = bio;
    }

    // Overriding displayInfo()
    @Override
    public void displayInfo() {
        System.out.println("\n--- Book & Author Details ---");
        super.displayInfo();
        System.out.println("Author Name      : " + name);
        System.out.println("Author Bio       : " + bio);
    }
}
