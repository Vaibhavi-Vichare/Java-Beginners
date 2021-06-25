package com.InterfacePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Pet implements Serializable
{
	int i=10;
	int j=20;
}

class Cow implements Serializable
{
	int i=30;
	int j=40;
}

class Bull implements Serializable
{
	int i=50;
	int j=60;
}
public class Serialization_and_Deserialization_Multiple_Objects 
{
	public static void main(String args[]) throws Exception
	{
		Pet p1 = new Pet();
		Cow c1 = new Cow();
		Bull b1 = new Bull();
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("Multiple_Objects.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(p1);
		oos.writeObject(c1);
		oos.writeObject(b1);
		
		//Deserialization
		FileInputStream fis = new FileInputStream("Multiple_Objects.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Pet p2		=	(Pet)	ois.readObject();
		Cow c2	= (Cow)	ois.readObject();
		Bull b2	= (Bull)  ois.readObject();
		
		System.out.println(p2.i +"::Pet Class::"+p2.j);
		System.out.println(c2.i +"::Cow Class::"+c2.j);
		System.out.println(b2.i +"::Bull Class::"+b2.j);
		
		System.out.println("********Another Method********");
		
		//Serialization
		FileOutputStream fos1 = new FileOutputStream("Multiple_Objects_1.ser");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(p1);
		oos1.writeObject(c1);
		oos1.writeObject(b1);
		
		//Deserialization
		FileInputStream fis1 = new FileInputStream("Multiple_Objects_1.ser");
		ObjectInputStream ois1 = new ObjectInputStream(fis1);
	
		Object o = ois1.readObject();
	
		if(o instanceof Pet)
		{
			Pet p3 = (Pet) o;
			System.out.println(p3.i +":::Pet Class:::"+p3.j);
		}
		else if (o instanceof Cow)
		{
			Cow c3 = (Cow) o;
			System.out.println(c3.i +":::Cow Class:::"+c3.j);
		}
		else if (o instanceof Bull)
		{
			Bull b3 = (Bull) o;
			System.out.println(b3.i +":::Bull Class:::"+b3.j);
		}
	}
}
