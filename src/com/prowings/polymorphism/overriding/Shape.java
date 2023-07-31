
package com.prowings.polymorphism.overriding;

public class Shape {

	    public void draw() {
			System.out.println("Shape");
		}
	    
		public void fill() {
			System.out.println("Shape Filled With Color");
		}
	
	
        public static void main(String[] args) {
	
	    Shape obj = new Square();
	
	    obj.draw();
	    obj.fill();
	    
        }
        
}
	


