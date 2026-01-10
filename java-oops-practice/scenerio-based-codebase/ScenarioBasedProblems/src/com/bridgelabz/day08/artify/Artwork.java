package com.bridgelabz.day08.artify;

public abstract class Artwork implements IPurchasable {

    protected String title;
    protected String artist;
    protected double price;
    protected String licenseType;

    protected boolean previewAvailable;

    // Constructor with preview
    public Artwork(String title, String artist,
                   double price, String licenseType,
                   boolean previewAvailable) {

        this.title = title;
        this.artist = artist;
        this.price = price;
        this.licenseType = licenseType;
        this.previewAvailable = previewAvailable;
    }

    // Constructor without preview
    public Artwork(String title, String artist,
                   double price, String licenseType) {

        this(title, artist, price, licenseType, false);
    }

    // Encapsulation: licensing protected
    protected String getLicenseType() {
        return licenseType;
    }

    @Override
    public void purchase(User user) {
        if (user.deductAmount(price)) {
            System.out.println(user.getName() +
                    " purchased artwork: " + title);
        } else {
            System.out.println("Insufficient wallet balance");
        }
    }

    // license() is left abstract for polymorphism
}
