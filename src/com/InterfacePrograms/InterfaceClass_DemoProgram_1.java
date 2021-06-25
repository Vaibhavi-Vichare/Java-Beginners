/*
 * All the methods in an INTERFACE are declared with an empty body and are public, 
 * and all fields are public, static and final by default.
 * 
 * Abstract classes may contain non-final variables, whereas variables in interface are final, public and static. 
 */

package com.InterfacePrograms;

interface DemoProgram1
{
	//public,static,final
	final int a=10;
	
	//public and abstract
	void getDisplay();
}

public class InterfaceClass_DemoProgram_1 implements DemoProgram1 
{
	@Override
	public void getDisplay() 
	{
		System.out.println("Demo Program 1 of Interface.");
		
	}
	
	public static void main(String args[])
	{
		InterfaceClass_DemoProgram_1 idp1= new InterfaceClass_DemoProgram_1();
		idp1.getDisplay();
		
		System.out.println("Value of a is: " + a);
	}

}
