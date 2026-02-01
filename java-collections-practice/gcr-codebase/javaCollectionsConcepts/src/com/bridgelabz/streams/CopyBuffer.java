package com.bridgelabz.streams;
import java.io.*;
public class CopyBuffer {
	
	public static void main(String[]args) {
		
		String s = "src/com/bridgelabz/streams/input.txt";
		String ss = "src/com/bridgelabz/streams/Output.txt";
		long startTime = System.nanoTime();
		try(BufferedInputStream bs = new BufferedInputStream(new FileInputStream(s));
				BufferedOutputStream bss = new BufferedOutputStream(new FileOutputStream(ss))){
			
			byte[] buffer = new byte[4096];
			int br;
			
			while((br = bs.read(buffer))!=-1) {
				bss.write(buffer,0,br);
			}
			
		}
		catch (IOException e) {
			System.out.println("Unexpected Error");
		}
		long endTime = System.nanoTime();
		System.out.println("Buffered time: "+(endTime-startTime));
	}

}
