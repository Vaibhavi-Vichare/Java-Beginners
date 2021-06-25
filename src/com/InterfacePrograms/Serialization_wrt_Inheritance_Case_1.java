/*
 * Serialization with respect to INHERITANCE.
  * Case1:
  * Parent class implements Serializable.
  * Child class doesn't implement Serializable.
  */
package com.InterfacePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	String name = "XYZ";
}

class Student_ID extends Student 
{
	int id = 43278;
}

public class Serialization_wrt_Inheritance_Case_1 
{
	public static void main(String args[]) throws Exception
	{
		Student_ID s1 = new Student_ID ();
		
		FileOutputStream fos = new FileOutputStream("Serialization_wrt_Inheritance_Case_1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
		
		FileInputStream fis = new FileInputStream("Serialization_wrt_Inheritance_Case_1.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student_ID s2 = (Student_ID) ois.readObject();
		
		System.out.println("Studnet name:: "+s2.name+"  Studnet ID:: "+s2.id);
	}
}
