package com.prowings.encapsulation;

public class TestPojo {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setName("Ram");
		emp.setId("male");
		emp.setSalary(50000d);
		
		
		System.out.println(emp.getName());
		System.out.println(emp.getId());
		System.out.println(emp.getSalary());
		
		
	}

}
