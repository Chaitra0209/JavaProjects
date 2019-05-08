package com.uttara.test;

/*public class StaticInit {
	static
	{
		int b=50;
	}
	int a = 30;
	{
		System.out.println(a);
		a = 40;
	}
	
	static int b = 40;
	public StaticInit()
	{
		System.out.println(a);
		System.out.println(b);
	}

}*/

public class StaticInit {
	static int b = 20 ;
	public StaticInit()
	{
		System.out.println("Inside constructor body");
		System.out.println(a);
		System.out.println(b);
	}
	int a = 10;
	{
		System.out.println("Inside instance initializer");
	    System.out.println(a);
	}
	
	
	static
	{
		System.out.println("Inside the static block");
		System.out.println(b);
		b=30;
		System.out.println(b);
		b++;
		System.out.println(b);
		
		
	}
//	int a = 10;
	
	
}



//My output is 50 30 40 50 40