package com.learning.datastructures02.arrays;

import java.util.Arrays;

public class DsaExample_13_Arrays_LargestAndSmallest_Sorting
{
	public static void main(String[] args)
	{
		int arr[] = {55, 32, 45, 98, 82, 11, 9, 39, 50};
		int len = arr.length;
		
		Arrays.sort(arr);
		
        System.out.println("Array: " + Arrays.toString(arr));
        
        System.out.println("Smallest: " + arr[0]);
        System.out.println("Largest: " + arr[len-1]);
	}
}
