package com.uttara.test;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Hello Everyone....");
		
		for (int i = 0; i  < args.length; i++) {
			System.out.println(args[i]);
		}
		
		for (String str : args) {
			System.out.println(str);
		}

	}

}
