package com.bridgelabz.linkedlist.book;

class LibraryList {
    BookNode head, tail;

    // Add book at end
    void addBook(int id, String title, String author, String genre, boolean available) {
        BookNode newNode = new BookNode(id, title, author, genre, available);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Remove book by ID
    void removeBook(int id) {
        BookNode temp = head;

        while (temp != null) {
            if (temp.bookId == id) {
                if (temp == head) head = temp.next;
                if (temp == tail) tail = temp.prev;
                if (temp.prev != null) temp.prev.next = temp.next;
                if (temp.next != null) temp.next.prev = temp.prev;
                return;
            }
            temp = temp.next;
        }
    }

    // Display forward
    void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title + " Available: " + temp.available);
            temp = temp.next;
        }
    }

    // Display reverse
    void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookId + " " + temp.title);
            temp = temp.prev;
        }
    }
}
