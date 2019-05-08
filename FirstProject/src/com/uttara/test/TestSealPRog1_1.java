package com.uttara.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestSealPRog1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Map<String,Integer>map = new HashMap<String,Integer>();
			map.put("Chaitra",31);
			map.put("Mayur",1);
			map.put("La Handu",70);
			map.put("Sanju",34);
			map.put("GB",64);
			
			System.out.println(map.size());
			System.out.println(map);
			
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
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the age for the name "+s1 );
				int val2 = scan.nextInt();
				map.put(s1,val2);
				System.out.println(map);
				System.out.println(map.size());
				
				
			}
				
			
	}



}
