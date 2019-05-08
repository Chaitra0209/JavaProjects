package com.uttara.sets;

public class Item implements Comparable {

	private String name;
	private double price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Item)
		{
			Item it = (Item)obj;
			if(this.price==it.price && this.name.equals(it.name))
				return true;
			else
				return false;
		}
		else return false;
	}
	
	@Override
	public int hashCode() {
		
		return (name+price).hashCode();
	}
	
	@Override
	public String toString() {
		
		return "Item :"+name+","+price;
	}
	
	@Override
	public int compareTo(Object o) {
		if(o instanceof Item)
		{
			Item it = (Item)o;
			if(this.price < it.price)
				return -1;
			else
				if(this.price > it.price)
					return +1;
				else
				{
					//return 0; If prices are equal, I want to compare names
					return this.name.compareTo(it.name);
				}
		}
		else
			throw new IllegalArgumentException("Only Item can be compared with another item, Guggu!!");
	}
	
}
