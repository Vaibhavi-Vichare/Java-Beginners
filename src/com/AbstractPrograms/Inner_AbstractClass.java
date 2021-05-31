/*
 * Inner Abstract Class.
 */

package com.AbstractPrograms;

class Human
{
	abstract class Greetings
	{
		abstract void getGreetings();
	}	


	class EnglishMan extends Greetings
	{
		@Override
		void getGreetings()
		{
			System.out.println("Hello!");
		}
	}
	
	class FrenchMan extends Greetings
	{
		@Override
		void getGreetings()
		{
			System.out.println("Bonjour!");
		}
	}
}


public class Inner_AbstractClass 
{
	 public static void main(String args[])
	 {
		 Human h1 = new Human();
		 /*
		  * Here to access inner abstract class, we need to go through Human class.
		  * That's why we write Human.Greetings
		  * Also, similarly both EnglishMan and FrenchMan are in the Human class.
		  * So, we can access them as follows.
		  */
		 Human.Greetings g1 = h1.new EnglishMan();
		 g1.getGreetings();
		 
		 Human.Greetings g2 = h1.new FrenchMan();
		 g2.getGreetings();

	 }
}
