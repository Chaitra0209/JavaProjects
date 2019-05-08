package com.uttara.test;

import java.io.File;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class TestFile {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the path");
		String path = sc1.nextLine();
		
		File f = new File(path);
		System.out.println("does the path exist "+f.exists());
		System.out.println("Is it a file/directory"+f.isFile()+" "+f.isDirectory());
		System.out.println("length = "+f.length());
		System.out.println("name = "+f.getName());
		System.out.println("Absolute path = "+f.getAbsolutePath());
		System.out.println("can read / write / hidden  = "+f.canRead()+" "+f.canWrite()+" "+f.isHidden());
		System.out.println("LAst Modified "+f.lastModified());
		System.out.println("----------------------------------------------");
		
		if(f.isDirectory()) {
			File[] fa = f.listFiles();
			for(File fi : fa)
			{
				System.out.println("----------------------------------------------");

				System.out.println(fi.getName());
				System.out.println("----------------------------------------------");

			}
		}
		
		
	}

}
