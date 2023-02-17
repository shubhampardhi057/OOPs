package com.prowings.polymorphism.overloading;

public class ConstructorOverloading {
	
	int roll;
	String name;
	
	public ConstructorOverloading(){
		
	}
	public ConstructorOverloading(int roll) {
		this.roll=roll;	
	}

	public ConstructorOverloading(String name) {
		this.name=name;
	}
	public ConstructorOverloading(int roll,String name) {
		this.roll=roll;
		this.name=name;
	}
	public ConstructorOverloading(String name,int roll) {
		this.name=name;
		this.roll=roll;
	}
	
	public static void main(String[] args) {
		
		ConstructorOverloading obj = new ConstructorOverloading(17001,"Shubham");
		
		System.out.println(obj.roll);
		System.out.println(obj.name);
		
		
	}
}
