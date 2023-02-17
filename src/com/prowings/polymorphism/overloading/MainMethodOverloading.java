package com.prowings.polymorphism.overloading;

public class MainMethodOverloading {
	
	public static void main(String[] args) {
		
		System.out.println("Inside main(String[]) method");
		
		Integer [] num = {10,20,30};
		
		main(num);
		
	}

	public static void main(Integer[] args) {
		
		System.out.println("Inside main(Integer[]) method");
	}
}
