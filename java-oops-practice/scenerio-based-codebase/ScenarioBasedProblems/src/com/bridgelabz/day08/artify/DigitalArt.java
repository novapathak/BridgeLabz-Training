package com.bridgelabz.day08.artify;

public class DigitalArt extends Artwork {

    public DigitalArt(String title, String artist,
                      double price, String licenseType,
                      boolean previewAvailable) {

        super(title, artist, price, licenseType, previewAvailable);
    }

    @Override
    public void license() {
        System.out.println("Digital License Applied: "
                + getLicenseType());
        System.out.println("Allows online and commercial use");
    }
}
