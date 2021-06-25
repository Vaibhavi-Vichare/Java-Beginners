package com.InterfacePrograms;

import java.io.*;

public class Receiver_SerialVersionUID 
{
	public static void main(String args[]) throws Exception
	{
		FileInputStream fis = new FileInputStream("SerialVersionUID.ser");
		ObjectInputStream ois  = new ObjectInputStream(fis);
		
		Serialization_SerialVersionUID s2 = (Serialization_SerialVersionUID) ois.readObject();
		
		System.out.println(s2.i+"........"+s2.j+".....");
	}
}
