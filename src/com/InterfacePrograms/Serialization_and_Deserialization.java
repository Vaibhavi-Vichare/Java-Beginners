package com.InterfacePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog_12 implements Serializable
{
	int i = 10;
	int j=20;
	//If we declare transient variable
	transient int k = 30;
	
	//If we declare static variable
	transient static int l = 40;
	
	//If we declare final variable
	transient final int m = 50;
}

public class Serialization_and_Deserialization 
{
	public static void main(String args[]) throws Exception
	{ 
		Dog_12 d1 = new Dog_12 ();
		
		//Serialization
		FileOutputStream fos = new FileOutputStream("Se_De.ser");
		//But by writing above line, File will automatically create at following location::
		//D:\Projects\Eclipse Projects\Java For Beginners\Java-For-Beginners
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		//Deserialization
		FileInputStream fis = new FileInputStream("Se_De.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		//Return type is a object but internally which object is there? Dog object is there
		//That's we do type casting here.
		Dog_12 d2 = (Dog_12) ois.readObject();
		
		//Static variable don't take part in Serialization.
		System.out.println("Using d1:: i= " + d1.i +" j= "+ d1.j +" k= "+ d1.k+" l= "+d1.l+" m= "+d1.m);
		System.out.println("Using d2:: i= " + d2.i +" j= "+ d2.j +" k= "+ d2.k+"  l= "+d2.l+" m= "+d2.m);
	}
}
