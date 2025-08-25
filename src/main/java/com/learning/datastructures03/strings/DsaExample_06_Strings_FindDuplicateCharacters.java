package com.learning.datastructures03.strings;

import java.util.Arrays;

// How do you print duplicate characters from a string?
// Brute force method
public class DsaExample_06_Strings_FindDuplicateCharacters
{
	// Brute force method
	public static void findDuplicateCharactersByBruteForce(char arr[], int len)
	{
	    	for(int i=0; i<len; i++)
	    	{
	    		for(int j=i; j<len; j++)
	    		{
	    			if(i!=j && arr[i] == arr[j])
	    			{
	    				System.out.println("Duplicate Element :"+arr[i]);
	    			}
	    		}
	    	}
	}
	
	// Sorting Technique
	public static void findDuplicateCharactersBySorting(char arr[], int len)
	{
		Arrays.sort(arr);
		
		for (int i=1; i<len; i++)
		{
			if(arr[i] == arr[i-1] && arr[i] != ' ')
			{
				System.out.println("Duplicate Element :"+arr[i]);
			}
		}
	}
	
	public static void main(String[] args) 
	{
	    String str = new String("Geeks for Geeks");
	 
	    char charArr[] = str.toCharArray();
	    int len = charArr.length;
	    
	    //findDuplicateCharactersByBruteForce(charArr, len);
	    findDuplicateCharactersBySorting(charArr, len);

	 } 
}	         
