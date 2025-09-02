package com.learning.datastructures10.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers nums and an integer target, 
// return indices of the two numbers such that they add up to target.
//
// You may assume that each input would have exactly one solution, 
// and you may not use the same element twice.
//
// You can return the answer in any order.
//
// Example 1:
//
// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

		
public class DsaExample_01_Arrays_SlidingWindow
{
	public static void main(String[] args)
	{
		int nums[] = {2,7,11,15};
		int target = 9;
		
		System.out.println("Result: "+ Arrays.toString(twoSum(nums, target)));
	}
	
    public static int[] twoSum(int[] nums, int target)
    {
    		Map<Integer, Integer> valueAndIndexMap = new HashMap<Integer, Integer>();
    		
    		for(int i=0; i<nums.length; i++)
    		{
    			int num1 = nums[i];
    			int num2 = target - num1;
    			
    			if(valueAndIndexMap.get(num2) == null)
    			{
    				valueAndIndexMap.put(num1, i);
    			}
    			else
    			{
    				int value = valueAndIndexMap.get(num2);
    				return new int[] {value, i};
    			}
    		}
    		
    		
        return new int[]{-1, -1};
    }
}
