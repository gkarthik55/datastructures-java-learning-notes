package com.learning.datastructures12.strings;

//Calculate the Sum in the given String which is commas separated.
//Ex: String s="9,99,9,99"; output:216

public class DsaExample_03_Strings_CountSumInString
{
	public static void main(String[] args) 
	{
		String str = "9,99,9,99";
		String[] strArray = str.split(",");
		
		int sum = 0;
		
		for(String s: strArray)
		{
			sum = sum + Integer.parseInt(s);
		}
		System.out.println("Sum:"+sum);
	} 
}	         