package com.learning.datastructures12.strings;

import java.util.Arrays;

//Write a Java program to check whether two strings are anagram or not?

//Two strings are called anagrams if they contain same set of characters but in different order.
// Example : "keep ? peek"

public class DsaExample_02_Strings_CheckAnagram
{
	public static void main(String[] args) 
	{
        String str1 = " keep";
        String str2 = " peek";
        
        IsAnagrams(str1, str2);
	}

	private static void IsAnagrams(String str1, String str2) 
	{
		boolean isAnagram = true;
		
		char charArr1[] = str1.toCharArray();
		char charArr2[] = str2.toCharArray();
		
		Arrays.sort(charArr1);
		Arrays.sort(charArr2);
		
		if(charArr1.length != charArr1.length)
		{
			isAnagram = false;
		}
		else
		{
			int len = charArr1.length;
			
			for(int i=0; i<len; i++)
			{
				if (charArr1[i] != charArr2[i])
				{
					isAnagram = false;
					break;
				}
			}
		}
		
		if(isAnagram)
		{
			System.out.println("Its an Anagram");
		}
		else
		{
			System.out.println("Its not an Anagram");
		}
	} 
}	         
