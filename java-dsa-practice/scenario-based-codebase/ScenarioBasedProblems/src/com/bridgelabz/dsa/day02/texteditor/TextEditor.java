package com.bridgelabz.dsa.day02.texteditor;
import java.util.*;

public class TextEditor {
	private Stack<String> texts;
	private Stack<String> undo;
	private StringBuffer sb=null;

	//TO INITIALISE TEXT EDITOR THROUGH CONSTRUCTOR
	public TextEditor() {
		texts = new Stack<>();
		undo = new Stack<>();
		sb=new StringBuffer();
	}
	
	//adding text in stack
	public void addText(String s) {
		texts.push(s);
		sb.append(s);
		System.out.println("Text added ");
		
	}
	
	//remove text from stack
	public void removeText() {
		if(texts.isEmpty())
			System.out.println("empty");
		else {
			int length=texts.pop().length();
			sb.delete(sb.length()-length, sb.length());
			System.out.println("text removed");
		}
	}
	//formatting stack
	public void format() {
		texts.clear();
		undo.clear();
		sb.delete(0, sb.length());
		System.out.println("Text Formatted removed evertything");
	}
	
	//Undo 
	public void undo() {
		if(texts.isEmpty()) {
			System.out.println("Nothing to undo!!!");
		}else {
			String undoString=texts.pop();
			int len =undoString.length();
			undo.push(undoString);
			sb.delete(sb.length()-len, sb.length());
			System.out.println("Undo operation success");
		}
	}
	
	//method to do redo operation
	public void redo() {
		if(undo.isEmpty()) {
			System.out.println("Nothing to redo");
		}else {
			String redoString = undo.pop();
			sb.append(redoString);
			texts.push(redoString);
			System.out.println("Redo successfully");
		}
	}

	public void displayText() {
		System.out.println(sb.toString());
	}
}
