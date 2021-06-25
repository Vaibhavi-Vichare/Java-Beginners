package com.InterfacePrograms;

interface A
{
	static void display()
	{
		System.out.println("Static Method in Interface A.");
	}
}

class B implements A
{
	static void display()
	{
		System.out.println("Static Method in Class B.");
	}
}

public class InterfaceClass_StaticMethod_1 
{
	public static void main(String args[])
	{
		/*
		 * Static methods are the methods in Java that can be called without creating an object of class. 
		 * They are referenced by the class name itself or reference to the Object of that class.  
		 */
		B b = new B();
		b.display();
		
		System.out.println("==========OR===========");
		
		B.display();
		
		/*
		 * Static method in an interface can't be called using an object or a reference varaible.
		 */
		A.display();
	}
}
