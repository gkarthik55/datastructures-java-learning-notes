package com.learning.leetcode03.prefixsum.pattern;

import java.util.HashMap;
import java.util.Map;

public class DsaExample_PrefixSum_02_SubarraySumEqualsK
{
	public static void main(String[] args)
	{
		int nums[] = {1, 2, 3};
		int k = 3;
		
		System.out.println(" Total count: "+SubarraySumEqualsK(nums, k));
	}
	
    public static int SubarraySumEqualsK(int[] nums, int k)
    {
    	Map<Integer, Integer> prefixSumCount = new HashMap<>();

        // Prefix sum 0 occurs once before we start (empty prefix)
        prefixSumCount.put(0, 1);

        int runningSum = 0;
        int totalSubarrays = 0;

        for (int currentValue : nums) 
        {
            runningSum += currentValue;

            int neededPrefix = runningSum - k;

            // If we have seen 'neededPrefix' before, those many subarrays end here with sum k
            if (prefixSumCount.containsKey(neededPrefix))
            {
                totalSubarrays += prefixSumCount.get(neededPrefix);
            }

            // Record the current runningSum in the map
            if (prefixSumCount.containsKey(runningSum))
            {
                prefixSumCount.put(runningSum, prefixSumCount.get(runningSum) + 1);
            } 
            else 
            {
                prefixSumCount.put(runningSum, 1);
            }
        }

        return totalSubarrays;
    }
}
