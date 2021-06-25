package com.InterfacePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class ParentClass
{
	int i =10;
	
	ParentClass()
	{
		System.out.println("ParentClass Construtor Called.");
	}
}

class ChildClass extends ParentClass implements Serializable
{
	int j=20;
	
	ChildClass()
	{
		System.out.println("ChildClass Construtor Called.");
	}
}

public class Serialization_wrt_Inheritance_Case_2 
{
	public static void main(String args[]) throws Exception
	{
		ChildClass c1 = new ChildClass();
		
		c1.i = 888;
		c1.j = 999;
		
		FileOutputStream fos = new FileOutputStream("Serialization_wrt_Inheritance_Case_2.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		
		System.out.println("De-serialization Started.");
		
		FileInputStream fis = new FileInputStream("Serialization_wrt_Inheritance_Case_2.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ChildClass c2 = (ChildClass) ois.readObject();
		
		System.out.println(c2.i+" ::Values are:: "+c2.j);
	}
}
