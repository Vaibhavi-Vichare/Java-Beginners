/*
 * Program 3
 * Abstract class that has an Abstract and Non-Abstract methods.
*/

package com.AbstractPrograms;

abstract class Shape
{
	abstract public void getDraw();
	
	public void getDisplay()
	{
		System.out.println("This is a geometric shape.");
	}
}

class Rectangle extends Shape
{
	@Override
	public void getDraw()
	{
		System.out.println("Drawing Rectangle.");
	}
}

class Circle extends Shape
{
	@Override
	public void getDraw()
	{
		System.out.println("Drawing Circle.");
	}
}


public class AbstactClass_has_Abstract_and_NonAbstract_Methods 
{
	
	public static void main(String args[])
	{
		Rectangle r1 = new Rectangle();
		r1.getDisplay();
		r1.getDraw();
		
		System.out.println("------------AND------------");
		
		Circle c1 = new Circle();
		c1.getDisplay();
		c1.getDraw();
		
		System.out.println("------------AND------------");
		
		Shape s1 = new Circle();
		s1.getDisplay();
		s1.getDraw();
	}	
}
