/*
 * If a class implements multiple interfaces, or an interface extends multiple interfaces, it is known as multiple inheritance.
 */

package com.InterfacePrograms;

interface Interface1
{
	void getDisplay();
}

interface Interface2
{
	void getShow();
}

public class Class_implements_MultipleInterface implements Interface1, Interface2
{

	@Override
	public void getShow() 
	{
		System.out.println("Interface2 method is running.");
	}

	@Override
	public void getDisplay() 
	{
		System.out.println("Interface2 method is running.");
	}
	
	public static void main(String args[])
	{
		Class_implements_MultipleInterface cim = new Class_implements_MultipleInterface();
		
		cim.getDisplay();
		cim.getShow();
	}

}
