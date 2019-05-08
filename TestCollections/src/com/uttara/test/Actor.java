package com.uttara.test;

import java.util.HashSet;
import java.util.Set;

public class Actor {

	private String name;
	private int age;
	
	public Actor() {
		
	}
	
	
	public Actor(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Actor)
		{
			Actor a = (Actor)obj;
			if(this.age==a.age && this.name.equals(a.name))
				return true;
			else
				return false;
				
	   }
		else 
			return false;
	  }
	
	@Override
	public int hashCode() {
		//use state of current object to arrive at the bucket number
		// Convert all state into concatenated String and then invoke hashCode() on String and return result
		
		return (name+age).hashCode();
		
	}
	
	@Override
	public String toString() {
		
		return "Actor:"+name+","+age;
	}
 }

class TestActor
{
	public static void main(String[] args)
	{
		String s1 = new String ("Happy MahaShivaRathri");
		String s2 = new String ("Happy MahaShivaRathri");
		String s3 = "test";
		
		System.out.println("IS s1 == s2 ?"+(s1==s2));
		System.out.println("Is s1.equals(s2) ?"+(s1.equals(s2)));
		
		System.out.println("s1's hashcode is "+(s1.hashCode()));
		System.out.println("s2's hashcode is "+(s2.hashCode()));
		System.out.println("s3's hashcode is "+(s3.hashCode()));
		
		Set hs = new HashSet();
		System.out.println("adding s1 into hs "+(hs.add(s1)));
		System.out.println("adding s2 into hs "+(hs.add(s2)));
		System.out.println("adding s3 into hs "+(hs.add(s3)));
		
		Actor a1 = new Actor("Alia",23);
		Actor a2 = new Actor("Alia",23);
		Actor a3 = new Actor("Kalia",23);
		
		System.out.println("a1 = "+a1);
		System.out.println("a3 = "+a3);
		
		System.out.println("Is a1 == a2 ? "+(a1 == a2));
		System.out.println("Is a1.equals a2 ? "+(a1.equals(a2)));
		System.out.println("a1.hashCode() "+a1.hashCode());
		System.out.println("a2.hashCode() "+a2.hashCode());
		System.out.println("a3.hashCode() "+a3.hashCode());
		
		Set actors = new HashSet();
		System.out.println("Adding a1 into actors "+actors.add(a1));
		System.out.println("Adding a2 into actors "+actors.add(a2));
		System.out.println("Adding a3 into actors "+actors.add(a3));
		
	}
}
