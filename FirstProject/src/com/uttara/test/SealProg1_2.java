package com.uttara.test;

public class SealProg1_2 {
	private String name;
	private int age;

	public SealProg1_2(String n,int a)
	{
	//	if(n==null || n.trim().equals(""))
	//	{
	//		throw new IllegalArgumentException("The name cannot be null, enter a valid name");
	//	}
	//	else
	//	{
			name = n;
	//	}
	/*	if(a<0 || a>130)
		{
			throw new IllegalArgumentException("not a valid value for age");
		}
		else
		{ */
			age =a;
	//	}
		
		
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
	public int hashCode() {
		return (name+age).hashCode();
	/*	final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result; */
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SealProg1_2 other = (SealProg1_2) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", age=" + age ;
	}

	
}
