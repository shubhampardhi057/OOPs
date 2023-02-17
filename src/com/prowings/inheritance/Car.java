package com.prowings.inheritance;

public class Car {
	
	    String company;
		Engine engine;
		int model;
		
		public Car() {
			super();
		}
		public Car(String company, Engine engine, int model) {
			super();
			this.company = company;
			this.engine = engine;
			this.model = model;
		}
		@Override
		public String toString() {
			return "Car [company=" + company + ", engine=" + engine + ", model=" + model + "]";
		}
		
		
	



}