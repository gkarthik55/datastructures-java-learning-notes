package com.learning.datastructures11.arrays;

public class DsaExample_01_Arrays_DuplicateElementsIdentify 
{
	// Find Duplicate Elements in an Array - Brute Force Method
	// Time complexity of this solution is O(n*n)

	public static void main(String[] args) 
	{
		int arr[] = { 5, 3, 2, 1, 1, 5, 1};
		int len = arr.length;
		
		for(int i=0; i<len; i++)
		{
			for(int j=i+1; j<len; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("Duplicate Element is "+arr[i]);
				}
			}
		}
	}
}
