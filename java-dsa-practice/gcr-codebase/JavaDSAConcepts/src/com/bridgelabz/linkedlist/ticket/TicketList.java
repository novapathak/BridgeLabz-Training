package com.bridgelabz.linkedlist.ticket;

class TicketList {
    TicketNode head = null;

    void addTicket(int id, String customer, String movie) {
        TicketNode node = new TicketNode(id, customer, movie);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        TicketNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    void displayTickets() {
        if (head == null) return;

        TicketNode temp = head;
        do {
            System.out.println(temp.ticketId + " " + temp.customer + " " + temp.movie);
            temp = temp.next;
        } while (temp != head);
    }
}
