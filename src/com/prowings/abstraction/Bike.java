package com.prowings.abstraction;

public abstract class Bike {

	Bike() {                                         // Constructor

		System.out.println("bike is created...!!!!!");

	}

	abstract void run();                            // Abstract method

	abstract void changeGear();                     // Abstract method
}
