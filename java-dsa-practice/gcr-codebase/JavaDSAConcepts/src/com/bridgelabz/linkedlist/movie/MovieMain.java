package com.bridgelabz.linkedlist.movie;

public class MovieMain {
    public static void main(String[] args) {
        MovieList list = new MovieList();

        list.addMovie("Inception", "Nolan", 2010, 8.8);
        list.addMovie("Interstellar", "Nolan", 2014, 9.0);

        list.displayForward();
        list.displayReverse();
        list.updateRating("Inception", 9.1);
    }
}
