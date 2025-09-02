package com.learning.datastructures12.strings;

public class DsaExample_09_Strings_RemoveWhitespaces 
{
	public static void main(String[] args) 
	{
		//Here they check difference between String and String Buffer.
		
		//String variable
		String str1 = "    This   is a   nice day   . ";
		
		//New Variable should be created for new Variable. 
		String str2 = str1.replaceAll("\\s","");
		
		String str3 = str1.replace("\\s","");
		
		System.out.println(" replaceAll : "+str2);
		
		System.out.println(" replace :  "+str3);
	}
}
