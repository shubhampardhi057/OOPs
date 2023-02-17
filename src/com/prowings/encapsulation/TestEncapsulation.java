package com.prowings.encapsulation;

public class TestEncapsulation {
	
	public static void main(String[] args) {
		
		Account account = new Account();
		
		account.setAccountNumber(38984727);
		account.setAmount(50000f);
		account.setName("Ram");
		
		System.out.println(account.getAccountNumber());
		System.out.println(account.getAmount());
		System.out.println(account.getName());
		
		
	}

}
