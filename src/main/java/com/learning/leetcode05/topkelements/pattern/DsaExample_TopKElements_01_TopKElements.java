package com.learning.leetcode05.topkelements.pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DsaExample_TopKElements_01_TopKElements
{
	public static void main(String[] args)
	{
		int nums[] = { 1, 1, 2, 2, 2, 3, 4, 4, 4 };
		int k = 2;

		System.out.println(Arrays.toString(topKFrequent(nums, k)));
	}

	public static int[] topKFrequent(int[] nums, int k) 
	{
		// 1) Count frequencies
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		
		for (int value : nums)
		{
			if (frequencyMap.containsKey(value))
			{
				frequencyMap.put(value, frequencyMap.get(value) + 1);
			} 
			else 
			{
				frequencyMap.put(value, 1);
			}
		}
		
		System.out.println(frequencyMap.toString());

		// 2) Buckets: index = frequency, value = list of nums with that frequency
		
		// Basically Frequency Buckets. - Maintain K buckets.
		//
		List<List<Integer>> buckets = new ArrayList<>(nums.length + 1);
		for (int i = 0; i <= nums.length; i++)
		{
			buckets.add(new ArrayList<>());
		}
		
		for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
		{
			int number = entry.getKey();
			int freq = entry.getValue();
			
			buckets.get(freq).add(number);
		}
		System.out.println(buckets.toString());

		// 3) Collect from highest frequency down until we gather k elements
		int[] result = new int[k];
	    int index = 0;

	    for (int freq = buckets.size() - 1; freq >= 0; freq--)
	    {
	    	for (int number : buckets.get(freq)) 
	    	{
	          result[index] = number;
	          index++;
	          
	          if (index == k)
	          {
	            return result;
	          }
	        }
	    }

		return result;
	}
}
