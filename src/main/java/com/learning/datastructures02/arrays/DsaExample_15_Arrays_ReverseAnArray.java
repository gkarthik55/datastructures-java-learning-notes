package com.learning.datastructures02.arrays;

// How do you reverse an array in place in Java?
// Time complexity is O(n)
public class DsaExample_15_Arrays_ReverseAnArray
{
	public static void main(String[] args)
	{
		int arr[] = { 1, 2, 6, 3, 2, 3 };

		reverseArrayElement(arr);


	}

	static void reverseArrayElement(int[] arr) 
	{
		int len = arr.length;
		int temp[] = new int[len];
	
		int j = 0;
		for (int i = len - 1; i >= 0; i--) 
		{
			temp[j] = arr[i];
			j++;
		}

		System.out.println("Elements of the Array:");
		for (int a : temp) {
			System.out.print("\t " + a);
		}
	}
}
