package com.learning.leetcode01.twopointers.pattern;

import java.util.Arrays;

// Given an integer array nums, move all 0's to the end of it while 
// maintaining the relative order of the non-zero elements.
// Note that you must do this in-place without making a copy of the array.
// 
// Example 1:
// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]

		
public class DsaExample_TwoPointers_01_MoveZeros
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {0,1,0,3,12};
		
		moveZeroes(nums);
	}
	
    public static void moveZeroes(int[] nums) 
    {
    	int len = nums.length;
    	int left = 0;

    	for(int right=0; right<len; right++)
    	{
    		if(nums[right] != 0)
    		{
    			int temp = nums[left];
    			nums[left] = nums[right];
    			nums[right] = temp;
    			
    			left++;
    		}
    	}
    	
    	System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroesBruteForce(int[] nums) 
    {
    	int len = nums.length;
    	
    	int temp[] = new int[len];
    	int j=0;
    	
    	for(int i=0; i<len; i++)
    	{
    		if(nums[i] != 0)
    		{
    			temp[j] = nums[i];
    			j++;
    		}
    	}
    	
    	System.out.println(Arrays.toString(temp));
    }
    

}
