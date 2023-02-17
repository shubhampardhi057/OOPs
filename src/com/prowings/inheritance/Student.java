package com.prowings.inheritance;

public class Student {
	
	int roll;
	long mobileNumber;
	public Student() {
		super();
	}
	public Student(int roll, long mobileNumber) {
		super();
		this.roll = roll;
		this.mobileNumber = mobileNumber;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", mobileNumber=" + mobileNumber + "]";
	}
	
	

}
