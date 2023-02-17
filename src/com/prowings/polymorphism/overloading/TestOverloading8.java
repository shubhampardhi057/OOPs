package com.prowings.polymorphism.overloading;

public class TestOverloading8 {
	
	public static void main(String[] args) {
		
		Method8 obj = new Method8();
		
		Integer i = null;
		
		Character c = null;
		
		Number n = null;
		
		Object o = null;
		
		Long l = null;
		
		
		obj.m1(i);
		
	    obj.m1(c);
	    
	    obj.m1(n);
	    
	    obj.m1(o);
	    
	    obj.m1(l);
	  
	    
	}

}
