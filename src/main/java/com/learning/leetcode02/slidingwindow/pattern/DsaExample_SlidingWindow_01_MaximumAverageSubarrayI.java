package com.learning.leetcode02.slidingwindow.pattern;

// 643. Maximum Average Subarray I
// You are given an integer array nums consisting of n elements, and an integer k.
//
// Find a contiguous subarray whose length is equal to k that has the maximum average value 
// and return this value. Any answer with a calculation error less than 10-5 will be accepted.
//
// Example 1:
//
// Input: nums = [1,12,-5,-6,50,3], k = 4
// Output: 12.75000
// Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
//
public class DsaExample_SlidingWindow_01_MaximumAverageSubarrayI
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {1,12,-5,-6,50,3};
		
		findMaxAverage(nums, 4);
	}
	
    public static double findMaxAverage(int[] nums, int k) 
    {
    	int sum = 0;
    	double maxSum = 0;
    	int len = nums.length;

    	for(int i=0; i<k; i++)
    	{
    		sum = sum + nums[i];
    	}
    	
    	maxSum = sum; //Initial Result
    	
    	//Now perform the Sliding Window for remaining elements.
    	for(int j=k; j<len; j++)
    	{
    		sum = sum + nums[j] - nums[j-k]; //Add Next Element and Remove First Element onwards
    		
    		maxSum = Math.max(maxSum, sum);
    	}
    	
    	System.out.println(maxSum); 
    	
    	double maxAverage = maxSum/k;
    	
    	System.out.println(maxAverage);
    	
    	return maxAverage;
    }
}
