package com.bridgelabz.dsa.day06.artexpo;

public class ArtExpoTest {
    public static void main(String[] args) {

        Artist[] artists = { new Artist(120),
        		new Artist(90),
            new Artist(150),
            new Artist(100)
        };

        ArtExpo expo = new ArtExpo();
        System.out.println("Before Sorting:");
        expo.display(artists);
        expo.insertionSort(artists);
        System.out.println("After Sorting:");
        expo.display(artists);
    }
}
