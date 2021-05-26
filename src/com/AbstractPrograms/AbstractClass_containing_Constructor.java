/*
 * Abstract class containing Constructor.
 */

package com.AbstractPrograms;


abstract class Bank
{
	String msg;
	
	Bank(String x)
	{
		this.msg = x;
	}
	
	void display()
	{
		System.out.println(msg);
	}
}

class Bob extends Bank
{
	Bob(String msg) 
	{
		super(msg);
	}
	
}


public class AbstractClass_containing_Constructor 
{
	public static void main(String args[])
	{
		Bob b1 = new Bob("Number 1 bank in the world.");
		b1.display();
		
		System.out.println("--------------OR--------------");
		
		Bank b2 = new Bob("BOB is a government bank.");
		b2.display();
	}
}
