package com.uttara.test;

public class TestPen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pen p1 = new Pen();
		p1.setInkQty(5);
		System.out.println("ink quantity ="+p1.getInkQty());
		p1.write("This is a tst ,passed as Str from Test Class to Pen class");
		System.out.println("ink quantity ="+p1.getInkQty());
		p1.setInkQty(0);
		p1.write("will u write this ?");
		
	}

}
