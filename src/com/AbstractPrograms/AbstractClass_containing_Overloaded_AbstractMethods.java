/*
 * Abstract class containing overloaded abstract methods.
 */

package com.AbstractPrograms;

abstract class Animal
{
	abstract public void getType_of_Animal();
	abstract public int getNo_of_legs();
	abstract public void getMsg(String msg);
}

class Dog extends Animal
{
	@Override
	public void getType_of_Animal()
	{
		System.out.println("It is a pet animal.");
	}
	
	@Override
	public int getNo_of_legs()
	{
		return 4;
	}
	
	@Override
	public void getMsg(String msg)
	{
		System.out.println(msg);
	}
}

class Tiger extends Animal
{
	@Override
	public void getType_of_Animal()
	{
		System.out.println("It is a wild animal.");
	}
	
	@Override
	public int getNo_of_legs()
	{
		return 4;
	}
	
	@Override
	public void getMsg(String msg)
	{
		System.out.println(msg);
	}
}

public class AbstractClass_containing_Overloaded_AbstractMethods 
{

	public static void main(String args[])
	{
		Dog d1 = new Dog();
		d1.getType_of_Animal();
		System.out.println("Number of legs dog has :" +d1.getNo_of_legs());
		d1.getMsg("Dog is a friendly animal.");
		
		System.out.println("-------------AND--------------");
		
		Tiger t1 = new Tiger();
		t1.getType_of_Animal();
		System.out.println("Number of legs tiger has :" +t1.getNo_of_legs());
		t1.getMsg("Tiger is not a friendly animal.");
		
		System.out.println("-------------OR--------------");
		
		Animal a1 = new Dog();
		a1.getType_of_Animal();
		System.out.println("Number of legs dog has :" +a1.getNo_of_legs());
	}
}
