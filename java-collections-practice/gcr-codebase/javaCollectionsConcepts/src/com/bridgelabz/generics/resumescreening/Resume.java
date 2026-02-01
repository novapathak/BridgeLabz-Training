package com.bridgelabz.generics.resumescreening;

public class Resume< T extends JobRole> {
	
	private T jobRole;
	public Resume(T jobRole) {
		this.jobRole = jobRole;
	}
	public T getJob() {
		return jobRole;
	}

}
