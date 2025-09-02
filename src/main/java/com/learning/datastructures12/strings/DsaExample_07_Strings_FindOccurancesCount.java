package com.learning.datastructures12.strings;

//Java program to count the occurrences of each character
public class DsaExample_07_Strings_FindOccurancesCount
{
	static final int NoOfChar = 256;
	
	static void fillCharCounts(String str, int count[])
	{
		for(int i=0; i<str.length(); i++)
		{
			count[str.charAt(i)]++;
		}
	}
	
	static void findOccurance(String str)
	{
		//Create a count array to maintain the count for the characters. 
		int count[] = new int[NoOfChar];
		
		fillCharCounts(str, count);
		
		for(int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			int occurance = count[c];
			
			System.out.printf("%c , occurance = %d\n", c, occurance);
		}
	}
       
	public static void main(String[] args) 
	{
        String str = "Geeks"; 
        findOccurance(str); 
	 } 
}	         
