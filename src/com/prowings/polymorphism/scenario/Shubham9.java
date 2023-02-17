package com.prowings.polymorphism.scenario;

import java.io.IOException; 

public class Shubham9 {

	void m1() throws Throwable
	{ 
	 System.out.println("m1-One"); 
	 } 
	} 
	 class P11 extends Shubham9 
	{ 
	@Override 
	protected void m1() throws Exception
	{ 
	 System.out.println("m1-Two"); 
	 } 
	} 
	 class P22 extends P11 
	{ 
	@Override 
	public final void m1() throws IOException
	{ 
	 System.out.println("m1-Three"); 
	 } 
	
	 class MyTest 
	{ 
	public static void main(String[] args) throws Throwable 
	{ 
	 Shubham9 o = new P11();
	 
	  o.m1(); 
	  
	 P11 t = new P22();
	 
	  t.m1();
	  
	 P22 th = new P22();
	 
	  th.m1(); 
	 } 
}
}