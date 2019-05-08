package com.uttara.test;

public class SingoJob implements Runnable {

	@Override
	public void run() {
		for(int i = 1 ; i <=100 ; i++)
			System.out.println("Singo Songo "+i);
		
	}
}
