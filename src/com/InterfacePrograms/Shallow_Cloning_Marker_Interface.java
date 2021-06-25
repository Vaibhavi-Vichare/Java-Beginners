/*
  * In Shallow Cloning, Object class clone method is meant for shallow cloning only.
  * That's why we just return clone() method of object class.	
  */
package com.InterfacePrograms;

class Cat
{
	int j;
	
	Cat (int j)
	{
		this.j = j ; 
	}
}

class Dog implements Cloneable
{
	Cat c;
	int i;
	
	Dog(Cat c , int i)
	{
		this.c = c;
		this.i  = i;
	}
	
	public Object clone () throws CloneNotSupportedException
	{
		//Here, I'm calling Object class clone() method only.
		return super.clone();
	}
}


public class Shallow_Cloning_Marker_Interface 
{
	public static void main(String args[]) throws CloneNotSupportedException
	{
		Cat c =new Cat(20);
		Dog d1 = new Dog (c, 10);
		
		Dog d2 = (Dog) d1.clone();
		/*
		  *Here, what happened?
		  *	d1 contains primitive data type which is int i and reference variable c, where reference 
		  *	variable contains another variable j.
		  * 	d1 --> which contains i & c which contains --> j
		  * 	After cloning, it copies everything from d1 to d2.
		  * 	d2 --> i & c--> j (Similar to d1)
		  **/
		
		//Before any changes
		System.out.println(d1.i + " ::Original Object:: "+ d1.c.j);
		System.out.println(d2.i + " ::Copied Object:: "+ d2.c.j);

		System.out.println("**************************");
		
		d2.i = 888;
		d2.c.j = 999;
		
		/*
		  * Here you can see reference variable of original copy is change 
		  * because of shallow cloning 
		  */
		
		//After making changes.
		System.out.println(d1.i + " ::Original Object:: "+ d1.c.j);
		System.out.println(d2.i + " ::Copied Object:: "+ d2.c.j);
		
	}
}
