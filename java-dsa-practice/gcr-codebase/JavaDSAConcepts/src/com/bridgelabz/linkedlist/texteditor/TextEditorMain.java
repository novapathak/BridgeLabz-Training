package com.bridgelabz.linkedlist.texteditor;

public class TextEditorMain {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();

        editor.type("Hello");
        editor.type("Hello World");
        editor.display();

        editor.undo();
        editor.display();

        editor.redo();
        editor.display();
    }
}
