package com.bridgelabz.dsa.day06.artexpo;

class ArtExpo {

    void insertionSort(Artist[] artists) {
        for (int i=1;i<artists.length;i++) {
            Artist key=artists[i];
            int j=i-1;

            while (j>=0&&artists[j].registrationTime>key.registrationTime) {
                artists[j+1]= artists[j];
                j--;
            }
            artists[j+1]= key;
        }
    }

    void display(Artist[] artists) {
        for (Artist a:artists) {
            System.out.print(a.registrationTime + " ");
        }
        System.out.println();
    }
}
