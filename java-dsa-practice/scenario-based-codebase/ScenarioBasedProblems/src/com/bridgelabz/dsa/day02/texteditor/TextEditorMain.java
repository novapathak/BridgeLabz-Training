package com.bridgelabz.dsa.day02.texteditor;

public class TextEditorMain {
	public static void main(String[] args) {
		
		TextEditor textEditor = new TextEditor();
		textEditor.addText("Hello");
		textEditor.addText(" Language.");
		textEditor.displayText();
		textEditor.removeText();
		textEditor.displayText();
		textEditor.undo();
		textEditor.displayText();
		
	}
}
