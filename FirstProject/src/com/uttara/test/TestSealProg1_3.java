package com.uttara.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

public class TestSealProg1_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String,Integer>map = new HashMap<String,Integer>();
		map.put("Chaitra",31);
		map.put("Mayur",1);
		map.put("La Handu",70);
		map.put("Sanju",34);
		map.put("GB",64);
		
		System.out.println(map.size());
		System.out.println(map);
		
		try
		{
			FileOutputStream fos =
			         new FileOutputStream("hashmap.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
	         oos.writeObject(map);
	         oos.close();
	         fos.close();
	         System.out.printf("Serialized data is saved in hashmap.ser");
		}
		catch(IOException i)
		{
			i.printStackTrace();
		}
		
		map = null;
		try
		{
	         
	         FileInputStream fileIn = new FileInputStream("hashmap.ser");
	         ObjectInputStream in = new ObjectInputStream(fileIn);
	         map = (HashMap) in.readObject();
	         
	         in.close();
	         fileIn.close();
			
		Scanner sc = new Scanner(System.in);
			System.out.println("Enter a name");
			String s1 = sc.nextLine(); 
			
			if(map.containsKey(s1))
			{
			int val1 = map.get(s1);
			System.out.println(val1);
	         }
			else
			{
				if(s1==null || s1.trim().equals(""))
				{
					throw new IllegalArgumentException("The name cannot be null or a char or numeric, enter a valid name");
				}
				else
				{
					Scanner scan = new Scanner(System.in);
					System.out.println("Enter the age for the name "+s1 );
					int val2 = scan.nextInt();
					if(val2<0 ||val2>130)
					{
						throw new IllegalArgumentException("not a valid value for age");
					}
					else
					{
						map.put(s1,val2);
						System.out.println(map);
						System.out.println(map.size());
					}
					
					
				}
				
				
				
				
			}
				
			
	}
		
	catch(IOException ex)
		{
		 System.out.println("IOException is caught"); 
		}
		
		catch (ClassNotFoundException c) {
	         System.out.println("class not found");
	         c.printStackTrace();
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
