package com.uttara.test;

public class Account {

	private double balance;
	private double amount;
	
	public void setBalance(double b)
	{
		if(b>999.99)
		{
			balance =b;
		}
		else
		{
			System.out.println("Please deposit minimum balance for the account to be active");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setAmount(double a)
	{
		amount = a;
	}
	
	public double getAmount()
	{
		return amount;
	}
	
	public void withdraw(double amount)
	{
		if(balance>=amount && ((balance-amount)>999.99))
		{
			balance = balance - amount;
			System.out.println("The amount withdraw is "+amount+" and the balance is "+balance);
		}
		else
		{
			System.out.println("Not enough balance to withdraw that amount "+amount);
		}
	}
	
	public void deposit(double amount)
	{
		System.out.println("Amount deposited successfully ");
		balance = balance+amount;
		System.out.println("Balance now is "+balance);
	}
}
