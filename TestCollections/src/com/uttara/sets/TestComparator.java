package com.uttara.sets;

import java.util.Set;
import java.util.TreeSet;

public class TestComparator {

	public static void main(String[] args) {
		
		StringLengthComparator slc = new StringLengthComparator();
		Set ts = new TreeSet(slc);  // u cant change this ref to StringVowelComparator's coz in TreeSet, linking happens only once,
		//So use a new ref and object
		
		ts.add("bengaluru");
		ts.add("mysuru");
		ts.add("tumkuru");
		ts.add("mangaluru");
		ts.add("beluru");
		ts.add("hubballi");
		ts.add("dharwad");
		ts.add("chikkamangaluru");
		
		
		
		Set t2 = new TreeSet(new StringVowelComparator());
		t2.addAll(ts);
		System.out.println("ts = "+ts);
		System.out.println("t2 = "+t2);
	}

}
