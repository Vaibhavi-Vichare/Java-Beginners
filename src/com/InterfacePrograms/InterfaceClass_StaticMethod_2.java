package com.InterfacePrograms;

interface Block_1
{
	static int display (int x)
	{
		return (x*x*x);
	}
}

class Square implements Block_1
{
	/*
	 * Defining display() in B is neither overriding nor overloading 
	 * since static method display() in interface A is not inherited in B.
	 */
	static void display()
	{
		System.out.println("This is a static Method.");
	}
}

public class InterfaceClass_StaticMethod_2 
{
	public static void main(String args[])
	{
		Square s1 =new Square();
		s1.display();
		
		System.out.println("============OR===============");
		Square.display();
		
		System.out.println("Cube of Square: " + Block_1.display(4));
	}
}
