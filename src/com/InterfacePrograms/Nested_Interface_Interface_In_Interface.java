package com.InterfacePrograms;

interface Employee_3
{
		public void getPosition();
		
		interface Employee_4
		{
			public int getSalary();
		}
}

class Client  implements Employee_3.Employee_4
{
	public void getPosition()
	{
		System.out.println("Employee 3 is a Softwear Developer.");
	}
	
	@Override
	public int getSalary()
	{
		return 20000;
	}
}

public class Nested_Interface_Interface_In_Interface 
{
		public static void main(String args[])
		{
				Client c1 = new Client();
				
				c1.getPosition();
				System.out.println(c1.getSalary());
				
				System.out.println("*********Another Method*********");
				Employee_3.Employee_4 emp3 = new Client();
				System.out.println(emp3.getSalary());
		}
}
