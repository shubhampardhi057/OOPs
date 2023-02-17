package com.prowings.polymorphism.overriding;

public class TestParent extends Parent {
	
	public void msg() 
	{
		System.out.println(" Child Method ");
	}
	
	public static void main(String[] args) {
		
		Parent obj = new Parent();
		TestParent obj1 = new TestParent();
		
		obj.msg();
		
		obj1.msg();
		
		
	}
}
		
		
