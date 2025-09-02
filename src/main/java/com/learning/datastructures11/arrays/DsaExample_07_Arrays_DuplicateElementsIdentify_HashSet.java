package com.learning.datastructures11.arrays;

import java.util.HashSet;
import java.util.Set;

// How are duplicates removed from a given array in Java?

// using Hashset - But dont say this in the beginning of the Interview.

// Tell them normal approach once and then tell them this approach.

public class DsaExample_07_Arrays_DuplicateElementsIdentify_HashSet 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 6, 3, 2, 4, 3, 5, 9 };

		removeDuplicateElement(arr);
	}

	static void removeDuplicateElement(int[] arr) 
	{
		int len = arr.length;
		Set<Integer> array = new HashSet<Integer>();

		for (int i = 0; i < len - 1; i++) 
		{
			array.add(arr[i]);
		}

		System.out.println("Elements of the Array:");
		for (Integer a : array) 
		{
			System.out.print("\t " + a);
		}

		System.out.println("");
	}
}
