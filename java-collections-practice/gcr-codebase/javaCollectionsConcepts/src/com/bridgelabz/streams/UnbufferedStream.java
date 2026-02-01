package com.bridgelabz.streams;
import java.io.*;
public class UnbufferedStream {
	public static void main(String args[]) {
		
		String s = "src/com/bridgelabz/streams/input.txt";
		String d = "src/com/bridgelabz/streams/Output.txt";
		
		long startTime = System.nanoTime();
		
		try (FileInputStream  fileF = new FileInputStream(s);
		    FileOutputStream fileS = new FileOutputStream(d)){
			
			byte[] buffer = new byte[4096];
			int br;
			
			while((br = fileF.read())!=-1) {
				fileS.write(buffer, 0, br);
			}
		}
		catch(IOException e) {
			System.out.println("Unexpected Error");
		}
		
		long endTime = System.nanoTime();
		System.out.println("unbuffered time: "+ (endTime-startTime));
		
		}

}
