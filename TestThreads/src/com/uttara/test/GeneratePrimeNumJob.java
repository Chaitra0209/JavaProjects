package com.uttara.test;

public class GeneratePrimeNumJob implements Runnable {

	@Override
	public void run() {
		long num = (long)(Math.random()*1000000000L);
		boolean flag = true;
		
		if(num%2 ==0)
		{
			flag = false;
		}
		else
			for(int i = 3 ; i<(long)Math.sqrt(num);i+=2)
			{
				if(num % i == 0)
				{
					flag = false;
					break;
				}
			}
				if(flag)
					System.out.println("Prime number generated with value = "+num);
	}

}
