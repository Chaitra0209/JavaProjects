package com.uttara.sets;

public class StringUtil {
	
	public static int findNumOfVowels(String str) 
	{
		int count = 0;
		str= str.toLowerCase();
		if(str==null || str.trim().equals(""))
			throw new IllegalArgumentException("String is null, pls pass a valid String");
		for(int i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++; // ++ cpunt is ok too
		}
		return count;
		
			
		
	}

}
