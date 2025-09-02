package com.learning.leetcode02.rotatetechnique;

import java.util.Arrays;

public class DsaExample_Rotate_01_RotateArrayByK
{
	public static void main(String[] args)
	{
		int nums[] = {1,2,3,4,5,6,7};
		int k = 3;
		
		rotate(nums, k);
	}
	
	public static void rotate(int[] nums, int k) 
	{
		nums = reverse(nums, 0, nums.length-1);
		nums = reverse(nums, 0, k-1);
		nums = reverse(nums, k, nums.length-1);
	}
	
	public static int[] reverse(int[] arr, int begin, int end)
	{
		while(begin < end)
		{
			int temp = arr[begin];
			arr[begin] = arr[end];
			arr[end] = temp; 
			
			begin++;
			end--;
		}
		
		System.out.println(Arrays.toString(arr));
		
		return arr;
	}
}
