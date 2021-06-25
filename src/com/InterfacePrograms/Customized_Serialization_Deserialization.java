package com.InterfacePrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Account implements Serializable
{
	String username = "Iron Man";
	transient String pwd = "tonystark";
	
	private void writeObject(ObjectOutputStream os) throws Exception
	{
		//First we need to perform default serialization.
		os.defaultWriteObject();
		//Then we perform Encryption. the variable is not stored in the file.
		String epwd = "123"+pwd;
		//Write encrypted variable onto the file.
		os.writeObject(epwd);
	}
	
	private void readObject(ObjectInputStream is) throws Exception
	{
		//Again we need to perform default serialization.
		is.defaultReadObject();
		//Read encrypted password.
		String epwd = (String) is.readObject();
		//Decrypt it. Remove encrypted part and store into the variable.
		pwd = epwd.substring(3);
	}
}
public class Customized_Serialization_Deserialization 
{
	public static void main(String args[]) throws Exception
	{
		Account a1 = new Account();
		System.out.println("Before Serialization:: username: " +a1.username+" password:  "+a1.pwd);
		
		FileOutputStream fos = new FileOutputStream("Customized_Serialization.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);
		
		FileInputStream fis = new FileInputStream("Customized_Serialization.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Account a2 = (Account) ois.readObject();
		
		System.out.println("After Serialization:: username: " +a2.username+" password:  "+a2.pwd);
	}
}
