package com.uttara.sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TestItem {

	public static void main(String[] args) {
		
		Item i1 = new Item("HeroPen",50);
		Item i2 = new Item("Topi",150);
		Item i3 = new Item("HeroPen",350);
		Item i4 = new Item("Topi",150);
		Item i5 = new Item("DeepaksNoteBook",15);
		Item i6 = new Item("Classmate",150);
		
		System.out.println("Comparing i2 with i4 "+i2.equals(i4));
		
		System.out.println("i2.hashCode = "+i2.hashCode());
		System.out.println("i4.hashCode = "+i4.hashCode());
		
		Set set = new TreeSet();  //Was HashSet() before, no need of comparable in Item.class
		
		System.out.println("Adding i1 into set "+set.add(i1));
		System.out.println("Adding i2 into set "+set.add(i2));
		System.out.println("Adding i3 into set "+set.add(i3));
		System.out.println("Adding i4 into set "+set.add(i4));
		System.out.println("Adding i5 into set "+set.add(i5));
		System.out.println("Adding i6 into set "+set.add(i6));
		
		System.out.println("set = "+set);
	}

}
