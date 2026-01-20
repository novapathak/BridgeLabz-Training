package com.bridgelabz.dsa.day04.eventmanager;

class EventManager {

    void quickSort(Ticket[] tickets, int low, int high) {
        if (low < high) {
            int p = partition(tickets, low, high);

            quickSort(tickets, low, p - 1);
            quickSort(tickets, p + 1, high);
        }
    }

    int partition(Ticket[] tickets, int low, int high) {
        int pivot = tickets[high].price;
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (tickets[j].price < pivot) {
                i++;
                Ticket temp = tickets[i];
                tickets[i] = tickets[j];
                tickets[j] = temp;
            }
        }

        Ticket temp = tickets[i + 1];
        tickets[i + 1] = tickets[high];
        tickets[high] = temp;

        return i + 1;
    }

    void display(Ticket[] tickets) {
        for (Ticket t : tickets) {
            System.out.print(t.price + " ");
        }
        System.out.println();
    }
}
