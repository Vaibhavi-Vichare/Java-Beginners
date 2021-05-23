package com.DemoPrograms;

public class Addtion_of_n_bit_arrays 
{
	public static void main(String args[])
	{

		int arr[] = m1();
		for (int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		//System.out.println(arr.length);
	}

	public static int[] m1()
	{
		int a[] = {1,0,1,0};
		int b[] = {1,1,1,1};
		int c[] = new int [5];

		int n =  a.length;
		int n1 = b.length;
		int n2 = c.length;

		int carry=0;

		for (int i=n-1 ; i>=0 ;i--)
		{
			c[i+1] = (a[i] + b[i] + carry) % 2;

			carry = (a[i] + b[i] + carry) / 2;

			//c[i+1] = carry;
		}
		c[0]=carry;
		return c;
	}
}



