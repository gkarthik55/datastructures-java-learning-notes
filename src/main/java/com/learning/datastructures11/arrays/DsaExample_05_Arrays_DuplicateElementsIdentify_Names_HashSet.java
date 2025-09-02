package com.learning.datastructures11.arrays;

import java.util.HashSet;
import java.util.Set;

public class DsaExample_05_Arrays_DuplicateElementsIdentify_Names_HashSet 
{
	// Find the Duplicate Name in an Array.

	// Approach 2 : Use HashSet data structure to find duplicates
	// Time complexity of this solution is O(n) and Space complexity of O(n)

	public static void main(String[] args) 
	{
		String[] names = { "Java", "C++", "C", "Scala", "Java", "Java", "C++", "C#" , "C++"};

		Set<String> uniqueSet = new HashSet<String>();
		Set<String> duplicateSet = new HashSet<String>();
		
		for(String name : names)
		{
			if(uniqueSet.add(name) == false)
			{
				duplicateSet.add(name);
			}
		}
		
		System.out.println("Duplicate Element List:");
		for(String name : duplicateSet)
		{
			System.out.print(" "+name);
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("Unique Element List:");
		for(String name : uniqueSet)
		{
			System.out.print(" "+name);
		}
		
		System.out.println();
	}
}
