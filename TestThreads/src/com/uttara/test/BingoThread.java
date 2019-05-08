package com.uttara.test;

public class BingoThread extends Thread {

	@Override
	public void run() {
		for(int i=1;i<=100;i++)
		//Logger.getInstance().log("")
			System.out.println("Pingu "+i);
	}
}
