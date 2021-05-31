

package com.AbstractPrograms;


abstract class OuterAbstractClass
{
	abstract class InnerAbstractClass
	{
		abstract void getDisplay();
	}
	
	abstract void getShow();
}

class SubClass1 extends OuterAbstractClass
{
	class SubClass2 extends InnerAbstractClass
	{
		@Override
		void getDisplay()
		{
			System.out.println("SubClass2 Method is running.");
		}
	}
	
	@Override
	void getShow()
	{
		System.out.println("SubClass1 method is running.");
	}
}

public class Nested_AbstractClass 
{

	public static void main(String args[])
	{
		OuterAbstractClass o1 = new SubClass1();
		
		SubClass1 s1 = (SubClass1)o1;
		
		SubClass1.SubClass2 ss1 = s1.new SubClass2();
		
		ss1.getDisplay();
		o1.getShow();
	}
}
