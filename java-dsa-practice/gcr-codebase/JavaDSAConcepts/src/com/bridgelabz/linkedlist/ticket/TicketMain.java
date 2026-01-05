package com.bridgelabz.linkedlist.ticket;

public class TicketMain {
    public static void main(String[] args) {
        TicketList list = new TicketList();

        list.addTicket(101, "Amit", "Avatar");
        list.addTicket(102, "Ravi", "Titanic");

        list.displayTickets();
    }
}
