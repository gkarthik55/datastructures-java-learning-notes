package com.learning.datastructures11.arrays;

import java.util.Arrays;

public class DsaExample_03_Arrays_DuplicateElementsIdentify_SortTechnique
{
	public static void main(String[] args)
	{
		int[] array = { 5, 3, 2, 1, 1, 5, 1, 5, 5, 2 };

		Arrays.sort(array); // in-place sort: array is modified

		boolean anyDuplicate = false;

		// Print each duplicate value exactly once
		for (int i = 1; i < array.length; i++)
		{
			if (array[i] == array[i - 1])
			{
				System.out.println("Duplicate Element: " + array[i]);
				anyDuplicate = true;
			}
		}

		if (!anyDuplicate)
		{
			System.out.println("No duplicates found.");
		}
	}
}