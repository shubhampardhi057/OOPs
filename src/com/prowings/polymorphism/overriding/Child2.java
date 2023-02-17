package com.prowings.polymorphism.overriding;

public class Child2 extends Parent2 {
	
	public void m1() {
		System.out.println("Child m1 Method");
	}
	
	public static void main(String[] args) {
		
		Parent2 p  = new Child2();                    //  UpCasting
		
//		Child2 c = new Parent2();                    //   DownCasting
		
		Child2 c1 = (Child2)p;
		
		p.m1();
		c1.m1();
		
		
	}

}
