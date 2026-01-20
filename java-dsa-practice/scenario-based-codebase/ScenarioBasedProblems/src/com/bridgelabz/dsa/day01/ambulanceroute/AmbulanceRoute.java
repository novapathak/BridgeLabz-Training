package com.bridgelabz.dsa.day01.ambulanceroute;

public class AmbulanceRoute {

    HospitalUnit head;

    void addUnit(String name, boolean available) {
        HospitalUnit unit = new HospitalUnit(name, available);

        if (head == null) {
            head = unit;
            head.next = head;
            return;
        }
        HospitalUnit temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = unit;
        unit.next = head;
    }

    void findAvailableUnit() {
        if (head == null) return;

        HospitalUnit temp = head;
        do {
            if (temp.available) {
                System.out.println(temp.name);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("No unit available");
    }

    void removeUnit(String name) {
        if (head == null) return;

        HospitalUnit curr = head;
        HospitalUnit prev = null;

        do {
            if (curr.name.equals(name)) {
                if (curr == head) {
                    HospitalUnit last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }
}
