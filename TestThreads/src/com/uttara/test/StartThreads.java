package com.uttara.test;

public class StartThreads {

	public static void main(String[] args) {
	
		System.out.println("main() starting ......");
		BingoThread t1 = new BingoThread();
		SingoJob job = new SingoJob();
		Thread t2 = new Thread(job);
	//	t1.run(); with calling of run, the output is deterministic , no new hread is started 
		// in a new stack. first the run() of BingoThread is called and 100 Pingu's are executed
		
		t1.start(); //I was supposed to get mixed Bengu and Pingu as output, but did not :/
		t2.start();
		//String str = null;
		//System.out.println(str.length());
		System.out.println("main() ending ......");
	
		/*for(int i=1;i<=100;i++)
			System.out.println("Bengu "+i); */

	}

}
