package com.bridgelabz.multithreading.downloadmanager;
import java.util.Random;

public class Filedownloader extends Thread {
	
	private String fileName;
	
	public Filedownloader(String name) {
		this.fileName = name;
	}
	

	public void run() {
		Random random = new Random();
		
		for(int i = 0; i <= 100; i+=25) {
			try {
				Thread.sleep(500+ random.nextInt(500));
			}
			catch (InterruptedException e) {
				System.out.println("Error");
			}
			System.out.println(Thread.currentThread().getName()+ " Downloading "+ fileName + ": "+i+"%");
		}
		
	}

}
