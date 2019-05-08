package com.uttara.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestReadingWritingWithBuffering {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter path to read from");
		String path1 = sc1.nextLine();
		System.out.println("Enter path to write to");
		String path2 = sc1.nextLine();
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try
		{
			br = new BufferedReader(new FileReader(path1));
			bw = new BufferedWriter (new FileWriter(path2));
			
			//reads one character by ch/c
			/*int x;
			while((x=br.read())!=-1)
				bw.write(x); */
			
			//to read line 
			String line;
			while((line = br.readLine())!=null)
			{
				System.out.println(line);
				bw.write(line);
				bw.newLine();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			if(br!=null)
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(bw!=null)
				try {
					bw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

	}

}
