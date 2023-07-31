package com.prowings.polymorphism.overriding;

public class Employee {

	public void m1()  {
		System.out.println("m1 Employeee");
	}
}
class Department extends Employee {
	
	public void m1() throws ArithmeticException {
		
		System.out.println("m1 Department");
	}
}
