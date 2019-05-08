package com.uttara.sets;

import java.util.Comparator;

public class StringLengthComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String)o1;
			String s2 = (String)o2;
			
			return s1.length() - s2.length();
					
		}
		else 
			throw new IllegalArgumentException("Only Strings can be passed !");
}
}

//Aim of this class is to build a 3rd party module that our TreeSet uses to compare in an non-natural ordering 

