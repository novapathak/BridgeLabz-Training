package com.bridgelabz.linkedlist.socialmedia;

public class SocialMediaMain {
    public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();

        sm.addUser(1, "Amit");
        sm.addUser(2, "Ravi");

        sm.addFriend(1, 2);
        sm.displayFriends(1);
    }
}
