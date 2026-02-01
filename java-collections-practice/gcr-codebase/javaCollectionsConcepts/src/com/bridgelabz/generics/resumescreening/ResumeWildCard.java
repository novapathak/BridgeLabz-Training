package com.bridgelabz.generics.resumescreening;
import java.util.List;
public class ResumeWildCard {
	
	public static void processresume(List<? extends JobRole>roles) {
		for(JobRole role : roles) {
			role.display();
		}
	}

}
