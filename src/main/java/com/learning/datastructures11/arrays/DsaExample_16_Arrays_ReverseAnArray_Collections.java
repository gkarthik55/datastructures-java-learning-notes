package com.learning.datastructures11.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DsaExample_16_Arrays_ReverseAnArray_Collections
{
	public static void main(String[] args)
	{
		int arr[] = new int[] { 1, 2, 6, 3, 2, 3 };

		List<Integer> arrayList = new ArrayList<Integer>();

		for (int element : arr)
		{
			arrayList.add(element);
		}

		Collections.reverse(arrayList);

		System.out.println("Elements of the Array after Reversing the Sequence");
		for (int a : arrayList)
		{
			System.out.print("\t " + a);
		}
		
		Collections.sort(arrayList);

		System.out.println("\nElements of the Array after Sorting");
		for (int a : arrayList)
		{
			System.out.print("\t " + a);
		}
	}
}
