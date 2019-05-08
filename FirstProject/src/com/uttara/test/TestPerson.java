package com.uttara.test;

import java.util.ArrayList;
import java.util.Collection;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("HemaMalini","hema@malini.com", 0);
		Person p2 = new Person("Rekha","rekha@evergreen.com",65);
		Person p3 = new Person("Rekha","rekha@evergreen.com",45);
		
		Collection col = new ArrayList();
		col.add(p1);
col.add(p2); 
		System.out.println(col);
	//	System.out.println("Is p3 there in col -> ?"+col.contains(p3));

	}

}
