package com.learning.datastructures11.arrays;

import java.util.Set;
import java.util.LinkedHashSet;

public class DsaExample_06_Arrays_DuplicateElementsIdentify_LinkedHashSet 
{
	// To Preserve the ordering and to remove duplicates in the integer array
	// using LinkedHashSet
	private static void removeDuplicates(int[] numbers) 
	{
		Set<Integer> integerArray = new LinkedHashSet<Integer>();

		for (int i : numbers) 
		{
			integerArray.add(i);
		}

		System.out.println("Elements after removing the Duplicate values:" + integerArray);
	}

	public static void main(String[] args)
	{
		// Java Program to remove duplicates from integer array
		int[] iArray = new int[] { 4, 3, 3, 4, 5, 2, 4 };
		removeDuplicates(iArray);
	}
}
