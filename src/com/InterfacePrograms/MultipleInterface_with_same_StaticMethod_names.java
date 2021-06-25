package com.InterfacePrograms;

interface FirstOne
{
	static int display()
	{
		return 5;
	}
}

interface SecondOne
{
	static double display()
	{
		return 3.4;
	}
}

class ThirdOne implements FirstOne, SecondOne
{
	static String display()
	{
		return "Static Method";
	}
}

public class MultipleInterface_with_same_StaticMethod_names 
{
	public static void main(String args[])
	{
		ThirdOne t1 = new ThirdOne();
		//System.out.println(t1.display());
		
		System.out.println(SecondOne.display());
	}
}
