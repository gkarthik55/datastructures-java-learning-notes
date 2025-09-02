package com.learning.datastructures11.arrays;

import java.util.Arrays;

// How to Insert an item into an array at a specific index in java? Good Approach
// Time complexity is O(n)

public class DsaExample_09_Arrays_InsertElementAtSpecificIndex 
{
	public static void main(String[] args) 
	{
		int arr[] = { 1, 2, 6, 3, 2, 3 };

		insertElementAtPos(arr, 5, 3);
	}

	static void insertElementAtPos(int[] arr, int ele, int pos) 
	{
		int len = arr.length;
		int temp[] = new int[len+1];
		
		for(int i=0; i<pos; i++)
		{
			temp[i] = arr[i];
		}
		
		temp[pos] = ele;
		
		for(int j=pos+1; j<=len; j++)
		{
			temp[j] = arr[j-1];
		}
		
		System.out.println(Arrays.toString(temp));
	}
}
