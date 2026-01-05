package com.bridgelabz.linkedlist.texteditor;

class TextEditor {
    TextState current;

    void type(String text) {
        TextState newState = new TextState(text);
        if (current != null) {
            current.next = newState;
            newState.prev = current;
        }
        current = newState;
    }

    void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    void display() {
        if (current != null)
            System.out.println("Current Text: " + current.text);
    }
}
