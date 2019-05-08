package com.uttara.sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;


public class TestSealProg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SealProg1 s1 = new SealProg1("Chaitra",31);
		SealProg1 s2 = new SealProg1("Mayur",1);
		SealProg1 s3 = new SealProg1("La Handu",70);
		SealProg1 s4 = new SealProg1("Sanju",34);
		SealProg1 s5 = new SealProg1("GB",64);
		
		Collection col= new HashSet();	
		col.add(s1);
		col.add(s2);
		col.add(s3);
		col.add(s4);
		col.add(s5);
		
		System.out.println(col);
		
/*		for(Object e : col)
		{
			String s=(String)e;
			System.out.println(s);
		} */
		

		// Phase 2 : take an inpout name from user, if it exists , then
		//display corresp age, else ask user to enter the name , age, add it to coll
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name");
		String s6 = sc.nextLine();
		
		if(col.contains(s6))
		{
			
		}
		
		
	}

}
