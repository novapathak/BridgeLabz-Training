package com.bridgelabz.multithreading.downloadmanager;

public class DownloadManager {
	public static void main(String[] args) throws InterruptedException{
		Filedownloader t1 = new Filedownloader("Document.pdf");
		Filedownloader t2 = new Filedownloader("Image.pdf");
		Filedownloader t3 = new Filedownloader("Video.pdf");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Download Complete");
	}

}
