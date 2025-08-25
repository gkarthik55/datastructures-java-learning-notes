package com.learning.datastructures03.strings;

public class DsaExample_10_Strings_ReverseEachStringInSentence 
{
	public static void main(String[] args) 
	{
		String str = "  Today is a Nice Day   ";
		String strArr[] = str.trim().split("\\s+");
		
		String revStr = "";
		
		for(String s: strArr)
		{
			StringBuffer sb = new StringBuffer(s);
			sb.reverse();
			
			revStr = revStr.concat(" "+sb);
		}
		
		System.out.println("Reversing the words in a Sentence :"+revStr);
	}
}
