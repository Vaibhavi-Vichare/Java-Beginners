/*
 * Java does not support MULTIPLE INHERITANCE in case of Class, but by using an INTERFACE it can achieve
 * multiple inheritance.
 * But, why Multiple Inheritance is not applicable?
 * -> Because it causes Diamond Problem or Ambiguity Problem.
 * -> What does that mean?
 * 				GrandParent
 * 			   /		   \
 * 			Parent1		Parent2
 * 			   \  		   /
 *				    Test 
 */


/*
 
 
package com.InterfacePrograms;

class GrandParent
{
	void fun()
	{
		System.out.println("GrandParent.");
	}
}

class Parent1 extends GrandParent
{
	@Override
	void fun()
	{
		System.out.println("Parent1.");
	}
}

class Parent2 extends GrandParent
{
	@Override
	void fun()
	{
		System.out.println("Parent2.");
	}
}


public class DiamondProblem extends Parent1 , Parent2 
{
	public static void main(String args[])
	{
		DiamondProblem dp = new DiamondProblem();
		dp.fun();
	}
}

Error : Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		at com.InterfacePrograms.DiamondProblem.main(DiamondProblem.java:46)

*/