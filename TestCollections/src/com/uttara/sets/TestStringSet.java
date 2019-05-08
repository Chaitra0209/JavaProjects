package com.uttara.sets;

import java.util.Set;
import java.util.TreeSet;

public class TestStringSet {
	
	public static void main(String[] args)
	{
		String s1 = "dobberman";
		String s2 = "alsatian";
		String s3 = "pug";
		String s4 = "hound";
		String s5 = "goldenretriever";
		String s6 = new String("hound");
		
		Set ts = new TreeSet();
		ts.add(s1);
		ts.add(s2);
		ts.add(s3);
		ts.add(s4);
		ts.add(s5);
		ts.add(s6);
		
		System.out.println(ts);
		
	}

}
