package com.bridgelabz.designpattern.librarymanagement;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        
        Book book1 = new Book.BookBuilder("Data Structures by Cormen")
                .setAuthors(Arrays.asList("Thomas Cormen"))
                .setEdition("3rd Edition")
                .setGenre("Computer Science")
                .setPublisher("MIT Press")
                .build();

        catalog.addBook(book1);
        book1.display();

     
        User student = UserFactory.createUser("student", "Nova");
        User faculty = UserFactory.createUser("faculty", "Dr. Sharma");

        student.getRole();
        faculty.getRole();

       
        BookNotificationService notificationService = new BookNotificationService();

        Observer studentObserver = new LibraryUserObserver("Nova");
        Observer facultyObserver = new LibraryUserObserver("Dr. Sharma");

        notificationService.subscribe(studentObserver);
        notificationService.subscribe(facultyObserver);

        notificationService.notifyUsers("Data Structures by Cormen is now available!");
    }
}
