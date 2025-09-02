package com.learning.leetcode03.prefixsum.pattern;

import java.util.Arrays;

public class PrefixSum
{
	public static void main(String[] args)
	{
		int arr[] = {3, 7, 2, 5, 8};
		
		System.out.println(Arrays.toString(calcualtePrefixSum(arr)));
	}
	
	public static int[] calcualtePrefixSum(int arr[])
	{
		int prefixSum[] = new int[arr.length];

		prefixSum[0] = arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			prefixSum[i] = arr[i-1] + arr[i] ; 
		}
		
		return prefixSum;
	}
}
