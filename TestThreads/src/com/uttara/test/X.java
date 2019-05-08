package com.uttara.test;

public class X extends Thread implements Runnable{ //No need to explicitly mentione
	//implements Runnable coz Thread already implements Runnable ! 
	
	@Override
	public void run() {
		System.out.println("In X's job");
	}
}
