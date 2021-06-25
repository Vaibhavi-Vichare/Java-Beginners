package com.InterfacePrograms;

import java.io.*;
/*
import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
*/

public class Externalization implements Externalizable
{
	String s;
	int i;
	int j;
	
	public Externalization()
	{
		System.out.println("Public Default Constructor.");
	}
	
	public Externalization(String s , int i, int j)
	{
		this.s = s;
		this.i = i;
		this.j = j;
	}
	
	@Override
	public void writeExternal(ObjectOutput os) throws IOException
	{
		os.writeObject(s);
		os.writeInt(i);
	}
	
	@Override
	public void readExternal(ObjectInput is) throws IOException, ClassNotFoundException
	{
		s = (String) is.readObject();
		i = is.readInt();
	}
	
	
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		Externalization e1 = new Externalization("ABCD", 10, 20);
		System.out.println("Before Serialization...");
		System.out.println("Value of s = "+e1.s+" i = "+e1.i+" j = "+e1.j);
		
		FileOutputStream fos = new FileOutputStream("Externalization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		
		FileInputStream fis = new FileInputStream("Externalization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Externalization e2 = (Externalization) ois.readObject();
		
		System.out.println("After De-Serialization...");
		System.out.println("Value of s = "+e2.s+" i = "+e2.i+" j = "+e2.j);
	}
}
