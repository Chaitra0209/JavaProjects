package com.uttara.test;

public class Pen {
private String name;
private String color; 
private int inkQty;

public void setInkQty(int i)
{
	if(i>1 && i< 25)
	{
		inkQty = i;
	}
	else
	{
		System.out.println("The range of allowed values for inkqty must be betw 1 and 25");
	}
}
public int getInkQty() {
	return inkQty;
}

public void setColor(String c)
{
	c=c.toLowerCase();
	if(c.equals("red") || c.equals("blue") || c.equals("black"))
	{
		color = c;
	}else
	{
		System.out.println("Not valid color for the pen ink");
	}
}

public String getColor()
{
	return color;
}

public void setName(String n)
{
	n=n.toLowerCase();
	if(n.equals("hero")|| n.equals("camlin"))
	{
		name = n;
	}
	else
	{
		System.out.println("Not a valid pen name");
	}
			
}

public String getName()
{
	return name;
}

public void write(String data) {
	if(inkQty>0)
	{
		System.out.println("pen "+name +"writing data"+data);
		inkQty--;		
	}
	else
	{
		System.out.println("First fill ink to the pen and then write");
	}
}
}
