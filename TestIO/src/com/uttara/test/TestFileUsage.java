package com.uttara.test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileUsage {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the path");
		String path = sc1.nextLine();
		
		//Write a code snippet to test whether a path exists and points to a 
		// text file, if yes, then print the contents to the monitor
		
		File f = new File(path);
				
		if(f.exists() && f.isFile() && f.getName().endsWith(".txt"))
		{
			FileReader fr = null;
			try
			{
				fr = new FileReader(f);
				int x;
				while((x=fr.read())!=-1)
				{
					System.out.print((char)x);
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
			finally
			{
				if(fr!=null)
					try {
						fr.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}
		}
		
	}

}
