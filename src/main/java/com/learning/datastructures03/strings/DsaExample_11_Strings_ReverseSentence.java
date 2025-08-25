package com.learning.datastructures03.strings;

public class DsaExample_11_Strings_ReverseSentence
{
	public static void main(String[] args) 
	{
        String str = "Today is a Good Day";
        String words[] = str.split(" ");
        
        int count = words.length-1;
        
        while(count >= 0)
        {
	        	System.out.print(" "+words[count]);
	        	
	        	count--;
        }
	}
}	         
