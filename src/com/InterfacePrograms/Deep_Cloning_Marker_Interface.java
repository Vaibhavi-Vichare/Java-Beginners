/*
  * The process of creating exactly duplicate independent copy including content object is called Deep Cloning.
  * In Deep Cloning, we need to override clone() method in our class.
  * The programmer is responsible for providing implementation. 
  */

package com.InterfacePrograms;

class Cat1
{
	int j;
	
	Cat1(int j)
	{
		this.j = j;
	}
}

class Dog1 implements Cloneable
{
	Cat1 c;
	int i;
	
	Dog1(Cat1 c , int i)
	{
		this.c = c;
		this.i = i;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		Cat1 c1 = new Cat1(c.j);
		Dog1 d = new Dog1 (c1, i);
		return d;	
	}

}

public class Deep_Cloning_Marker_Interface
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Cat1 c = new Cat1(10);
		Dog1 d1 = new Dog1(c,20);
		
		Dog1 d2 = (Dog1) d1.clone();
		
		//Before any changes
		System.out.println(d1.i + " ::Original Object:: "+ d1.c.j);
		System.out.println(d2.i + " ::Copied Object:: "+ d2.c.j);
		
		System.out.println("**************************");
				
		d2.i = 888;
		d2.c.j = 999;
		

		//After making changes.
		System.out.println(d1.i + " ::Original Object:: "+ d1.c.j);
		System.out.println(d2.i + " ::Copied Object:: "+ d2.c.j);
		

	}
}
