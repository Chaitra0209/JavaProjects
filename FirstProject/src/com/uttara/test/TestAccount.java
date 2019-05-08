package com.uttara.test;

public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a1 = new Account();
		a1.setBalance(500);
		a1.setBalance(1000.789);
		System.out.println("The current balance is "+a1.getBalance());
		a1.withdraw(15);
		a1.deposit(500.567);
		System.out.println("The current balance is "+a1.getBalance());
		

	}

	

}
