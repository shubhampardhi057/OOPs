package com.prowings.abstraction;

public abstract class Animal {

	abstract void makeSound();             // Abstract Method
	
	public void eat() {                    // Concrete Method
		
		System.out.println("I Can Eat");
	}
}
