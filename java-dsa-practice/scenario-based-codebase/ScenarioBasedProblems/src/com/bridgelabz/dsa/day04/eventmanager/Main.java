package com.bridgelabz.dsa.day04.eventmanager;

public class Main {
    public static void main(String[] args) {

        Ticket[] tickets = {
            new Ticket(1500),
            new Ticket(500),
            new Ticket(2000),
            new Ticket(800),
            new Ticket(1200)
        };

        EventManager em = new EventManager();

        em.quickSort(tickets, 0, tickets.length - 1);
        em.display(tickets);
    }
}
