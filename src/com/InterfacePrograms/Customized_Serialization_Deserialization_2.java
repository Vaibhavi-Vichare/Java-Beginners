package com.InterfacePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account_1 implements Serializable
{
	String username = "Iron Man";
	transient String pwd = "abc@xyz";
	transient int pin = 6493;
	
	private void writeObject(ObjectOutputStream os) throws Exception
	{
		os.defaultWriteObject();
		String epwd = "123" + pwd;
		int epin = 9999 + pin;
		os.writeObject(epwd);
		os.writeInt(epin);
	}
	
	private void readObject(ObjectInputStream is) throws Exception
	{
		is.defaultReadObject();
		String epwd = (String) is.readObject();
		pwd = epwd.substring(3);
		int epin = is.readInt();
		pin = epin - 9999;
		
	}
}

public class Customized_Serialization_Deserialization_2 
{
	public static void main(String args[]) throws Exception
	{
		Account_1 a1 = new Account_1();
		System.out.println("Before Serialization:: Username: "+a1.username+" Password: "+a1.pwd+" Pin: "+a1.pin);
		
		FileOutputStream fos = new FileOutputStream("Customized_Serialization_1.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("Customized_Serialization_1.ser");
		ObjectInputStream ois =  new ObjectInputStream(fis);
		Account_1 a2 = (Account_1) ois.readObject();
		
		System.out.println("Before Serialization:: Username: "+a2.username+" Password: "+a2.pwd+" Pin: "+a2.pin);
	}
}
