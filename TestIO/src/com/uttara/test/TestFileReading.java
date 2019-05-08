package com.uttara.test;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFileReading {

	public static void main(String[] args) {
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter path of file to read");
		String path1 = sc2.nextLine();
		System.out.println("Enter the path of file to write");
		String path2 = sc2.nextLine();
		// declare 3rd party resource reference variable to null
		FileReader fr = null;
		FileWriter fw = null;
		
		try
		{
			//Initialize resource reference variables to objects
			fr = new FileReader(path1);
			fw = new FileWriter(path2,true); //appends to the file
			
			//Apply business logic
			int x ;
			while((x=fr.read())!=-1)
			{
				char c = (char)x;
				System.out.println("c = "+c);
				fw.write(c);
			}
			System.out.println("done !!");
		}
		catch(IOException e) //handle specific exception
		{
			e.printStackTrace();
		}
		
		finally
		{
			//resource release
			if(fr!=null)
				try {
					fr.close();
				    }
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
			if(fw!=null)
				try {
					fw.close();
					} 
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					}
		}
		

	}

}
