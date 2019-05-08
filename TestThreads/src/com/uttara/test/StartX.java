package com.uttara.test;

public class StartX {

	public static void main(String[] args) {
	/*	X obj = new X();
		obj.start(); */
		
		Thread t = new Thread();
		Thread t1 = new Thread(t); // = new Thread(obj) ithu
		t1.start();

	}

}
