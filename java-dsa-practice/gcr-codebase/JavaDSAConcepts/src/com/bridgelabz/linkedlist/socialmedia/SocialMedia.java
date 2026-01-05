package com.bridgelabz.linkedlist.socialmedia;

class SocialMedia {
    UserNode head;

    void addUser(int id, String name) {
        UserNode user = new UserNode(id, name);
        user.next = head;
        head = user;
    }

    void addFriend(int userId, int friendId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                FriendNode f = new FriendNode(friendId);
                f.next = temp.friends;
                temp.friends = f;
                return;
            }
            temp = temp.next;
        }
    }

    void displayFriends(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                FriendNode f = temp.friends;
                while (f != null) {
                    System.out.println("Friend ID: " + f.friendId);
                    f = f.next;
                }
                return;
            }
            temp = temp.next;
        }
    }
}
