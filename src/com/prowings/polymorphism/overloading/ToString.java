package com.prowings.polymorphism.overloading;

public class ToString {
	
   public String toString() {
		
		return getClass().getName()+"@"+ Integer.toHexString(hashCode());
		
	}
	
	public static void main(String[] args) {
		
		ToString s = new ToString();
		
		
		System.out.println(s.toString());
		
	}

}
