package com.bridgelabz.day08.artify;

public class PrintArt extends Artwork {

    public PrintArt(String title, String artist,
                    double price, String licenseType) {

        super(title, artist, price, licenseType);
    }

    @Override
    public void license() {
        System.out.println("Print License Applied: "
                + getLicenseType());
        System.out.println("Only personal display allowed");
    }
}
