package com.learning.datastructures03.strings;

// How do you check if a given string is a palindrome or not?
public class DsaExample_08_Strings_PalindromeOrNot
{
	public static void main(String[] args) 
	{
        String str = "radar"; 
        String revStr = "";
        
        int len = str.length();
        
        for(int i=len-1; i>=0; i--)
        {
        		revStr = revStr + str.charAt(i);
        }
        
        if(str.equals(revStr))
        		System.out.println("It's a Palindrome");
        else 
         	System.out.println("It's not a Palindrome");
	 } 
}	         
