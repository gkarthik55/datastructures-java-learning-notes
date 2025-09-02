package com.learning.datastructures10.leetcode;

import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer k, return the total number 
// of subarrays whose sum equals to k.
// A subarray is a contiguous non-empty sequence of elements within an array.
//
// Example 1:
//
// Input: nums = [1,1,1], k = 2
// Output: 2

public class DsaExample_04_Arrays_SlidingWindow_SubArraySumEqualsToK
{
	public static void main(String[] args)
	{
		int nums[] = {1,2,3};
		int k = 3;
		
		System.out.println(subArraySum(nums, k));
	}
	
	
	public static int subArraySum(int nums[], int k)
	{
		Map<Integer, Integer> prefixFrequencyBySum = new HashMap<>();
        prefixFrequencyBySum.put(0, 1); // one way to have sum 0 before starting

        int runningPrefixSum = 0;
        int totalSubarraysMatchingTarget = 0;

        for (int currentValue : nums)
        {
            runningPrefixSum += currentValue;

            int requiredPreviousSum = runningPrefixSum - k;
            Integer waysToReachRequiredSum = prefixFrequencyBySum.get(requiredPreviousSum);
            if (waysToReachRequiredSum != null)
            {
                totalSubarraysMatchingTarget += waysToReachRequiredSum;
            }

            Integer existingCountForCurrentSum = prefixFrequencyBySum.get(runningPrefixSum);
            if (existingCountForCurrentSum == null)
            {
                prefixFrequencyBySum.put(runningPrefixSum, 1);
            }
            else
            {
                prefixFrequencyBySum.put(runningPrefixSum, existingCountForCurrentSum + 1);
            }
        }

        return totalSubarraysMatchingTarget;
	}
	
	// Brute Force
	public static int subArraySum_BruteForce(int nums[], int k)
	{
		int len = nums.length;
		
		for(int i=0; i<len; i++)
		{
			for(int j=i; j<len; j++)
			{
				if(i == j && nums[j] == k)
				{
					System.out.println(nums[j]);
				}
				
				if(nums[i] + nums[j] == k)
				{
					System.out.println(nums[i]+ " : " + nums[j]);
				}
			}
		}
		
        return 0;
	}
}
