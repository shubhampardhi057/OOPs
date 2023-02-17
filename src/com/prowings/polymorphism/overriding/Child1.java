package com.prowings.polymorphism.overriding;

public class Child1 extends Parent1 {
	
	public void m1() {
		
		System.out.println("Child m1 Method");
	}

        public static void main(String[] args) {
	
	          Parent1 p =  new Parent1();
              Child1 c =   new Child1();
              Parent1 p1= new Child1();
              
              
//            Child1 c1 =  new Parent1();
    
             Child1 c2 = (Child1)p1;
    
                 p.m1();
                 p.m2();
                 c.m1();
                 p1.m1();
                   c2.m1();
                   
        }
}
    
  




