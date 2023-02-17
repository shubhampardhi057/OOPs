package com.prowings.encapsulation;

public class TestEncapsulation1 {
	
	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.setRollNo(1234);
		std.setName("Ram");
		std.setMarks(98f);
		
		System.out.println(std.getRollNo());
		System.out.println(std.getName());
		System.out.println(std.getMarks());
		
		
	}

}
