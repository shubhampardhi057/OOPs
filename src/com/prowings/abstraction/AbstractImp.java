package com.prowings.abstraction;

public class AbstractImp extends AbstractClassDemo {

	public void print()
	{
		System.out.println("inside print method");
	}
	
	public static void main(String[] args) {
		
		AbstractClassDemo obj = new AbstractImp();
		
		obj.print();
		obj.printHello();              // method from parent class
		
	}
}
