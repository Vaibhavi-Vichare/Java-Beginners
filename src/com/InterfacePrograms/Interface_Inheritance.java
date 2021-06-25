/*
 * A class implements an interface, but one interface extends another interface.
 */

package com.InterfacePrograms;

interface Bank
{
	void getDisplay();
	int getRate_of_Interest(int x);
}

interface PrivateBank extends Bank
{
	void getShow();
}

public class Interface_Inheritance implements PrivateBank 
{
	static int x=0;

	@Override
	public void getDisplay()
	{
		System.out.println("Bank Information.");
	}

	@Override
	public int getRate_of_Interest(int x) 
	{
		Interface_Inheritance.x = x;
		return x;
	}

	@Override
	public void getShow() 
	{
		System.out.println("Private Bank.");
	}
	
	public static void main(String args[])
	{
		Interface_Inheritance in = new Interface_Inheritance();
		in.getDisplay();
		in.getShow();
		in.getRate_of_Interest(12);
		System.out.println("Rate of interest is " +x);
		
	}
	
}
