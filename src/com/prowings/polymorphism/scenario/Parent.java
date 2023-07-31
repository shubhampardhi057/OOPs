package com.prowings.polymorphism.scenario;

public class Parent {
	
	public void testMethod(Object n) {
		
		System.out.println("Parent Object");
	}
	public void testMethod(Number n) {
		
		System.out.println("Parent Number");
	}
	public void testMethod(Integer n) {
		
		System.out.println("Parent Integer");
	}
	
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		p.testMethod(10);
		
	}
	

}
