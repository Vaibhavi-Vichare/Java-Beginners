package com.InterfacePrograms;

interface University
{
	void getName(String name);
	void  getRoll_No (int roll_no);
	void getDepartment(String department);
}


class MumbaiUniversity implements University
{
	int roll_no;
	@Override
	public void getName(String name)
	{
		System.out.println("Student name is "+ name);
	}
	
	@Override
	public void getRoll_No (int roll_no)
	{
		this.roll_no = roll_no;
		System.out.println("Roll number is "+ roll_no);
	}
	
	public void getDepartment(String department)
	{
		System.out.println("Student is from "+ department + "department.");
	}
}


class DelhiUniversity implements University
{
	int roll_no;
	@Override
	public void getName(String name)
	{
		System.out.println("Student name is "+ name);
	}
	
	@Override
	public void getRoll_No (int roll_no)
	{
		this.roll_no = roll_no;
		System.out.println("Roll number is "+ roll_no);
		
	}
	
	public void getDepartment(String department)
	{
		System.out.println("Student is from "+ department + "department.");
	}
}

public class InterfaceClass_DemoProgram_2 
{
	public static void main(String args[])
	{
		MumbaiUniversity mu = new MumbaiUniversity();
		mu.getName("ABC");
		mu.getRoll_No(101);
		mu.getDepartment("Computer Science");
		
		DelhiUniversity du = new DelhiUniversity();
		du.getName("XYZ");
		du.getRoll_No(102);
		du.getDepartment("Electrical");
	}
}
