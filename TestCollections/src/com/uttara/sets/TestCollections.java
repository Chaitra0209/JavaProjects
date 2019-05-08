package com.uttara.sets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {
	
	public static void main(String[] args)
	{
		List li = new ArrayList();
		li.add("shiva");
		li.add("durga");
		li.add("krishna");
		li.add("vishnu");
		li.add("madeshwara");
		li.add("dakshinamurthy");
		li.add("adiyogi");
		li.add("adiyogi");
		
		System.out.println("list without sorting "+li);
		
		Collections.sort(li);
		System.out.println("List with sorting based on natural ordering "+li);
		
		StringVowelComparator svc = new StringVowelComparator();
		Collections.sort(li,svc);
		System.out.println("List with sorting based on non-natural ordering(number of vowels "+li);
		
		Collections.sort(li,new StringLengthComparator());
		System.out.println("List with sorting based on non-natural ordering - length of Strings "+li);
		
		String s = new String("adiyogi");
		int num = Collections.frequency(li, s);
		System.out.println("number of times the string "+s+" occurs in the list is "+num);
		
		Collections.shuffle(li);
		System.out.println("List after shuffling is "+li);
		
		//Similarly do for Arrays and the methods. they sort primitive arrays also. 
		
	}

}
