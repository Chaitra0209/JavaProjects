package com.uttara.sets;

import java.util.Comparator;

public class StringVowelComparator implements Comparator {

	public int compare(Object o1, Object o2) 
	{
		if(o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String)o1;
			String s2 = (String)o2;
			
			//find num of vowels in s1 -> n1;
			int n1 = StringUtil.findNumOfVowels(s1);
			// find num of vowels in s2 -> n2 ;
			int n2 = StringUtil.findNumOfVowels(s2);
			// return n1-n2
			return n1-n2;
			
			
			
		}
		else 
			throw new IllegalArgumentException("Only Strings can be passed !");
}

	}

