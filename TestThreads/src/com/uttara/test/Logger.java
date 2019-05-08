package com.uttara.test;

//package com.uttara.level3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Logger {

	private String path="/Users/chai/Desktop/Uttara/log.txt";
	private boolean devMode = true;
	
	public void log(String data)
	{
		new Thread(new Runnable() //Logger code is being put into a separate run method. That run method
				//is put into an object of runnable. Runnable reference is being given to Thread object
				//and on that thread object, start() method is being called. its at th end of close flower bracket.
				//Weird syntax coz Inner classes are being used.
				{
				public void run()
				{
		Date dt = new Date();
		BufferedWriter bw = null;
		try
		{
			String msg = dt+":"+data;
		
			bw = new BufferedWriter(new FileWriter(path,true));
			
			bw.write(dt.toString()+":"+data);
			bw.newLine();
			if(devMode)
			System.out.println(data);
			
			//in Sir's video the below 2 lines is the code. LOGTOMONITOR issame as devmode that is used above.
		//	if(Logger.LOGTOMONITOR==true)
			//System.out.println("Logger:"+msg);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
				}
		}).start();
	}
	//Logger is a singleton means , it has a private constructor,
	private Logger()
	{
		System.out.println("in Logger() no-arg constr");
	}
	// private static ref variable
	private static Logger obj = null;
	
	// public static getInstance()
	public static Logger getInstance()
	{
		System.out.println("in Logger getInstance(), obj = "+obj);
		if(obj == null)
			obj = new Logger();
		
		return obj;
	}
	
}
