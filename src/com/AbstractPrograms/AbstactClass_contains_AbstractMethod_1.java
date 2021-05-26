/*
 * Program 1
 * Abstract class that has an Abstract method.
 */


package com.AbstractPrograms;

abstract class Vehicle
{
	abstract public void getBrand();	
}

class Honda extends Vehicle
{
	@Override
	public void getBrand()
	{
		System.out.println("Vehicle is of Honda Brand.");
	}
}

class Volkswagen extends Vehicle
{
	@Override
	public void getBrand()
	{
		System.out.println("Vehicle is of Volkswagen Brand.");
	}
}


public class AbstactClass_contains_AbstractMethod_1 
{
	public static void main(String args[])
	{
		Honda h1 = new Honda();
		h1.getBrand();
		
		Volkswagen v1 = new Volkswagen();
		v1.getBrand();
		
		System.out.println("OR");
		
		/*
		 * Below lines of code uses the concept of Run-time Polymorphism.
		 * In this process, an overridden method is called through the reference variable of a superclass.
		 * Here,we are calling the Brand method by the reference of Parent class.
		 * Since it refers to the subclass object and subclass method overrides the Parent class method, 
		 * 		the subclass method is invoked at runtime.
		 */
		
		Vehicle v2 = new Honda();
		v2.getBrand();
	}
}
