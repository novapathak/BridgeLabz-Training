package com.bridgelabz.streams;

import java.io.*;
import java.io.IOException;

public class FileCopyBasic {
    public static void main(String[] args) {
    	try{
    	FileInputStream fileFirst = new FileInputStream ("src/com/bridgelabz/streams/input.txt");
    	FileOutputStream fileSecond = new FileOutputStream ("src/com/bridgelabz/streams/output.txt");
    	
    	int data;
    	while((data = fileFirst.read())!=-1) {
    		fileSecond.write(data);
    	}
    	fileFirst.close();
    	fileSecond.close();
    		
    	}
    	catch(IOException e){
    		System.out.println("Source file doesn't exist");
    		
    	}File inputFile = new File("src/com/bridgelabz/streams/input.txt");
    	if (!inputFile.exists()) {
    	    System.out.println("File not found at: " + inputFile.getAbsolutePath());
    	    return;
    	}
    
    	}
} 
