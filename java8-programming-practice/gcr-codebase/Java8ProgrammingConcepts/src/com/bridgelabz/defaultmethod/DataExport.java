package com.bridgelabz.defaultmethod;

interface Export{
	void export();
	default void exportToJSON() {
		System.out.println("Exported in JSON");
	}
}

class CSV implements Export{
	
	@Override
	public void export() {
		System.out.println("Exported in CSV");
		
	}
}
class PDF implements Export{
	
	@Override
	public void export() {
		System.out.println("Exported in PDF");
		
	}
}
public class DataExport {
public static void main(String[]args) {
	Export csv = new CSV();
	Export pdf = new PDF();
	
	csv.export();
	csv.exportToJSON();
	pdf.export();
	pdf.exportToJSON();
	
}
}
