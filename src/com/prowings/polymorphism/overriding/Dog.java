package com.prowings.polymorphism.overriding;

public class Dog extends Animal {
	
	public void displayInfo(int a) {
		
		System.out.println("I am a Dog ");
		
	}
	
	public static void main(String[] args) {
		
		Dog obj = new Dog();
		
		Animal obj1 = new Dog();
		
		
		
		obj.displayInfo(10);
		obj1.displayInfo();
		
		
		
		
	}

}
