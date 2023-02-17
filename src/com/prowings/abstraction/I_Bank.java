package com.prowings.abstraction;

public interface I_Bank {
	
	float rateOfInterest();
}

class ICICI implements I_Bank{
	
	public float rateOfInterest() {
		
		return 9.15f;
	}
}
 
 class BOM implements I_Bank {
	

	public float rateOfInterest() {
		
		return 9.7f;
	}
	
}

