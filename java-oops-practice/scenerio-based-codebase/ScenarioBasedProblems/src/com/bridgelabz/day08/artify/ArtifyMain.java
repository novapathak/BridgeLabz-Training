package com.bridgelabz.day08.artify;

public class ArtifyMain {

    public static void main(String[] args) {

        User user = new User("Aarav", 5000);

        Artwork art1 = new DigitalArt(
                "Cyber Dreams", "Riya", 2000,
                "Commercial", true);

        Artwork art2 = new PrintArt(
                "Nature Bliss", "Karan", 1500,
                "Personal");

        art1.purchase(user);
        art1.license();

        System.out.println("Wallet Balance: " +
                user.getWalletBalance());

        System.out.println();

        art2.purchase(user);
        art2.license();

        System.out.println("Wallet Balance: " +
                user.getWalletBalance());
    }
}
