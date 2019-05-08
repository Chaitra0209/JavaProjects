package com.uttara.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionsAPITest {

	public static void main(String[] args) {
		//important shortcuts
		//ctrl + space => Code complete 
		//ctrl + 1 => Code Assist feature
		//ctrl + Shift + o => Import fully qualified class name
		
	/*	String str = "Terminator";
		System.out.println("str = "+str);
		
		for(String x : args)
		{
		System.out.println(x);
		} */
		
		Collection col = new ArrayList(); // try this same code with HashSet(), TreeSet(), instead of Array list , change the order of movies strings , make start ltter small and Observe and Analyse Outputs
		
		String s1 = "Happy New Year";
		String s2 = "Mohenjodaro";
		String s3 = "Bang Bang";
		String s4 = "Race";
		String s5 = "The Lift";
		
		System.out.println("Adding s1 into col = "+col.add(s1));
		System.out.println("Adding s2 into col = "+col.add(s2));
		System.out.println("Adding s3 into col = "+col.add(s3));
		System.out.println("Adding s4 into col = "+col.add(s4));
		System.out.println("Adding s5 into col = "+col.add(s5));
		System.out.println("Adding s5 into col = "+col.add(s5));
		System.out.println("Adding s5 into col = "+col.add(s5));
		
		System.out.println("Size = "+col.size());
		System.out.println("col = "+col);
		
		System.out.println("Searching for s4 in col = "+col.contains(s4));
		col.remove(s5);
		System.out.println("col = "+col);
		
		for(Object o : col)
		{
			String str = (String)o;
			if(str.length()>4)
			System.out.println(str);
		}
		
		String s6 = new String("Bang Bang");
		System.out.println("IS s6 present in  col ? "+col.contains(s6));
		col.remove(s6);
		System.out.println("col = "+col);
		
		Collection col2 = new LinkedList();
		col2.add("Dishum");
		col2.add("Hero");
		col2.add("Race");
		col2.add("Raeez");
		
		//Bulk Methods
		col.addAll(col2);  // col.retainAll(col2); col.removeAll(col2);
		System.out.println("col = "+col);
			
		

	}

}
