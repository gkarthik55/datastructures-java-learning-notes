package com.learning.datastructures02.arrays;

// Find all pairs of an integer array whose sum is equal to a given number
// Time complexity is O(n^2)

public class JavaExample_Arrays_PairsOfInteger 
{
	public static void main(String[] args) 
	{
		int[] numbers = { 2, 5, 1, 6, 8, -1 };
		int sum = 7;

		printPairs(numbers, sum);
	}

	static void printPairs(int[] arr, int sum) 
	{
		int len = arr.length;
		
		for (int i=0; i<len; i++) 
		{
			int first = arr[i];

			for (int j=0; j<len; j++) 
			{
				// Need to put a condition such that you are not comparing the same elements.
				if(i!=j)
				{
					int second = arr[j];
					
					if (first + second == sum) 
					{
						System.out.println(" Pair is: " + first + ":" + second);
					}
				}
			}
		}
	}
}
