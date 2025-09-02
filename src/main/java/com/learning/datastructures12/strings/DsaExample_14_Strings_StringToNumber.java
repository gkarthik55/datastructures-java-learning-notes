package com.learning.datastructures12.strings;

// Convert String to Integer.
public class DsaExample_14_Strings_StringToNumber 
{
	public static void main(String[] args) 
	{
		int num = 54752735; 
		String s = "123545343";
		
		System.out.println("Covert String to Integer");
		num = Integer.parseInt(s);
		System.out.println(num);
	
		System.out.println("Covert Integer to String");
		Integer i = Integer.valueOf(s);
		System.out.println(i);
	}
}
