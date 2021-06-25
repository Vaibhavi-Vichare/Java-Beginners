/*
 * Starting from Java 8, interface can be augmented with Default Methods.  
 * Implementing classes may or may not override these methods. 
 * If they don't choose to override them, the default method from the interface is used. 
 * The definition of a default method must include the 'keyword Default.'
 * DEFAULT METHODS ONLY USED FOR INTERFACE.
 */

package com.InterfacePrograms;

interface DefaultMethod
{
	int x=5;
	
	public void show();
	
	default void display()
	{
		System.out.println(x+1);
	}
}

class Main implements DefaultMethod
{
	@Override
	public void show()
	{
		System.out.println(x);
	}
	
	/*
	 @Override
	 public void display()
	 {
	 	System.out.println(x+2);
	 }
	 */
}

public class InterfaceClass_DefaultMethod 
{
	public static void main(String args[])
	{
		Main m1 = new Main();
		
		m1.show();
		m1.display();
	}
}

/*	NOTE:
 * 	The program is valid even if display() in class Main is uncommented. In that case, overriding takes place and
 * 	will be 5 7.
 *  Keyword default should not be used while defining display() in class Main.
 *  display() in class Main must follow all overriding rules.
 */
 