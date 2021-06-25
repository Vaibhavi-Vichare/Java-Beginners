package com.InterfacePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Bus implements Serializable
{
	Cycle c1 = new Cycle();
}

class Cycle implements Serializable
{
	Bike b1 = new Bike();
}

class Bike implements Serializable
{
	int i=20;
}

public class Serialization_and_Deserialization_Object_Graph 
{
	public static void main(String args[]) throws Exception
	{
		Bus u1 = new Bus();
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("Object_Graph.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(u1);
		
		//Deserialization
		FileInputStream fis = new FileInputStream("Object_Graph.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Bus u2 = (Bus) ois.readObject();
		
		System.out.println(u2.c1.b1.i);
		
	}
}
