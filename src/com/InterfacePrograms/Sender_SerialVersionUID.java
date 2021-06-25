package com.InterfacePrograms;

import java.io.*;

public class Sender_SerialVersionUID 
{
	public static void main(String args[]) throws Exception
	{
		Serialization_SerialVersionUID s1 = new Serialization_SerialVersionUID();
	
		FileOutputStream fos = new FileOutputStream("SerialVersionUID.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);
	}
}
