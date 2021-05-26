/*
 * Program 2
 * Abstract class that has an Abstract method.
 */

package com.AbstractPrograms;


abstract class Vehicle_1
{
	abstract public int getNo_of_wheels();
}


class Car extends Vehicle_1
{
	@Override
	public int getNo_of_wheels()
	{
		return 4;
	}
}

class Auto extends Vehicle_1
{
	@Override
	public int getNo_of_wheels()
	{
		return 3;
	}
}

public class AbstactClass_contains_AbstractMethod_2 
{
	public static void main(String args[])
	{
		
		Car c1 = new Car();
		System.out.println("Car has " + c1.getNo_of_wheels() + " wheels.");
		
		Auto a1 = new Auto();
		System.out.println("Auto has " + a1.getNo_of_wheels() + " wheels.");
		
		System.out.println("OR");
		
		Vehicle_1 v1 = new Car();
		System.out.println("Car has " + v1.getNo_of_wheels() + " wheels.");
	}
}
