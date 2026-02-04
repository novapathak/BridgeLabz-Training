package com.bridgelabz.lambdaexpression;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

class Alert{
	
	String message;
	String type;
	int priority;
	
	public Alert(String message, String type, int priority) {
		this.message = message;
		this.type = type;
		this.priority = priority;
	}
	
	@Override
	public String toString() {
		return "Message:" + message + " Type: " + type + " Priority: "+ priority;
	}
}
public class NotificationFiltering {
	
	public static void main(String[]args) {
		
		List<Alert> list = new ArrayList<>();
		
		list.add(new Alert("Sugar", "NO prob", 5));
		list.add(new Alert("BP", "Emergency", 4));
		list.add(new Alert("Medicion", "Medication", 1));
		list.add(new Alert("Sleep time", "Emergency", 2));
		list.add(new Alert("Doctor Appointment", "Appointment", 3));
		
		Predicate<Alert> p = alert -> alert.type.equals("Emergency");
		Predicate<Alert> pp = alert -> alert.type.equals("Appointment");
		Predicate<Alert> ppp = alert -> alert.priority >= 3;
		Predicate<Alert> pppp = p.or(ppp);
		
		System.out.println("Alert Shown to user");
		
		for(Alert alert: list) {
			if(pppp.test(alert))
			System.out.println(alert);
		}
	}
	

}
