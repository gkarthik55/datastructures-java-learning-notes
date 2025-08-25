package com.learning.datastructures03.strings;

//Java program to check if a string contains only digits.
public class DsaExample_13_Strings_StringContainsDigits
{
	public static void main(String[] args) 
	{
		String str = "48656447";
		
		//+ mean one or more character.
		if(str.matches("[0-9]+") && str.length() > 2)
		{
			System.out.println("It consists of only numbers");
		}
		else
		{
			System.out.println("It does not consist only numbers");
		}
	} 
}	         
