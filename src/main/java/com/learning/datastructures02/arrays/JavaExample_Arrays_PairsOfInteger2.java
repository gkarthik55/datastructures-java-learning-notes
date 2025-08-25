package com.learning.datastructures02.arrays;

import java.util.Arrays;

// Find all pairs of an integer array whose sum is equal to a given number
// Time complexity is O(n)

public class JavaExample_Arrays_PairsOfInteger2 
{
	public static void main(String[] args) 
	{
		int[] numbers = { 2, 4, 7, 5, 9, 10, -1 };
		int sum = 9;

		printPairs(numbers, sum);
	}

	static void printPairs(int[] arr, int sum) 
	{
		Arrays.sort(arr);

		int begin = 0;
		int end = arr.length - 1;

		while (begin < end) 
		{
			int total = arr[begin] + arr[end];

			if (total == sum) 
			{
				System.out.println("Pair :" + arr[begin] + ":" + arr[end]);
				begin++;
				end--;
			} 
			else if (total < sum) 
			{
				begin++;
			} 
			else if (total > sum) 
			{
				end--;
			}
		}
	}
}
