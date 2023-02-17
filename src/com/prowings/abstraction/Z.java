package com.prowings.abstraction;

public abstract class Z implements I {
	
	public void m1() {
		System.out.println("inside m1()");
	}
    public int m2() {
    	System.out.println("inside m2()");
    	return 0;
    }
    public static void main(String[] args) {
		
		 X obj = new X();
		 
		obj.m1();
		obj.m2();
		obj.m3();
		
        Y obj1 = new Y();
		 
		obj1.m1();
		obj1.m2();
		obj1.m3();
    }
}