package com.uttara.test;

import java.util.*;

public class CollnArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Collection col = new TreeSet();
		String s1 = "Aurelia";
		String s2 = "Balsam";
		String s3 = "Cactus";
		String s4 = "Daisy";
		String s5 = "Lily";
		
		System.out.println(col.size());
		System.out.println(col.add(s1));
		System.out.println(col.add(s2));
		System.out.println(col.add(s3));
		System.out.println(col.add(s4));
		System.out.println(col.add(s5));
		System.out.println(col.add(s3));
		System.out.println(col.size());
		System.out.println(col.contains(s2));
		col.remove(s3);
		
		for(Object e: col)
		{
			String s = (String)e;
			System.out.println(s);
		}
		
				

	}

}
