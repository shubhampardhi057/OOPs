package com.prowings.abstraction;

public class Dog extends Animal {
	
	public void makeSound() {
		
		System.out.println("Bark  Bark");
	}

	public static void main(String[] args) {
		
		
		Dog obj = new Dog();
		
		obj.makeSound();
		obj.eat();
		
	}
}
