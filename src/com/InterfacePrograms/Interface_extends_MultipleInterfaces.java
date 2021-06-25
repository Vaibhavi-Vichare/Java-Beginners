/*
 * If an interface extends multiple interfaces, it is known as multiple inheritance.
 */


package com.InterfacePrograms;

interface First_Interface
{
	void getDisplay();
}

interface Second_Interface
{
	void getShow();
}


interface MainInterface extends First_Interface, Second_Interface
{
	void getMainInterface();
}

public class Interface_extends_MultipleInterfaces implements MainInterface 
{

	@Override
	public void getDisplay() 
	{
		System.out.println("First Interface Method");	
	}

	@Override
	public void getShow() 
	{
		System.out.println("Second Interface Method");
	}

	@Override
	public void getMainInterface() 
	{
		System.out.println("Maint Interface Method");	
	}
	
	public static void main(String args[])
	{
		Interface_extends_MultipleInterfaces iem = new Interface_extends_MultipleInterfaces();
		
		iem.getDisplay();
		iem.getShow();
		iem.getMainInterface();
	}

}
