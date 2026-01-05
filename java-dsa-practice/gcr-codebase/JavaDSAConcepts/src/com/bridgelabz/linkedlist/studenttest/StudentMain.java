package com.bridgelabz.linkedlist.studenttest;

public class StudentMain {
    public static void main(String[] args) {
        StudentLinkedList list = new StudentLinkedList();

        list.addStudent(1, "Amit", 20, 'A');
        list.addStudent(2, "Ravi", 21, 'B');

        list.display();
        list.updateGrade(2, 'A');
        list.searchStudent(1);
        list.deleteStudent(1);

        list.display();
    }
}
