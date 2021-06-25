/*
  *	This interface declared in a class can either be default, public, protected not private. 
  *	While implementing the interface, we mention the interface as c_name.i_name
  * 	where c_name is the name of the class in which it is nested and i_name is the name of the interface itself.  
  */
package com.InterfacePrograms;

class Employee_1
{
	interface Client
	{
		public void getReport();
	}
}

class Employee_2 implements Employee_1.Client
{
	@Override
	public void getReport()
	{
		System.out.println("Client is showing the report.");
	}
	
	public void showReport()
	{
		System.out.println("Employee 2 has report.");
	}
}

public class Nested_Interface_Interface_In_Class 
{
	public static void main(String args[])
	{
			Employee_2 emp2 = new Employee_2();
			emp2.getReport();
			emp2.showReport();
			
			System.out.println("*********Another Method*********");
			
			Employee_1.Client emp1 = new Employee_2();
			emp1.getReport();
	}
}
