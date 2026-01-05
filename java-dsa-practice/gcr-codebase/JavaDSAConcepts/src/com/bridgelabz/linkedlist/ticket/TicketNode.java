package com.bridgelabz.linkedlist.ticket;

class TicketNode {
    int ticketId;
    String customer, movie;
    TicketNode next;

    TicketNode(int ticketId, String customer, String movie) {
        this.ticketId = ticketId;
        this.customer = customer;
        this.movie = movie;
    }
}
