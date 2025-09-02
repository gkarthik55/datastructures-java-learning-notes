package com.learning.datastructures10.leetcode;

import java.util.HashMap;
import java.util.Map;

// 2. Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without duplicate characters.
// 
// Example 1:
//
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// 

public class DsaExample_03_Arrays_SlidingWindowUsingMaps_LongestSubstring
{
	public static void main(String[] args)
	{
		String str = "abcabcbb";
		
		System.out.println("Result: " + longestSubstring(str));
	}

	public static int longestSubstring(String s)
	{
        if (s == null || s.isEmpty())
        {
            return 0;
        }

        Map<Character, Integer> charIndex = new HashMap<>();
        int begin = 0;
        int max = 0;

        for (int end = 0; end < s.length(); end++)
        {
            char ch = s.charAt(end);

            if (charIndex.containsKey(ch) && charIndex.get(ch) >= begin)
            {
                begin = charIndex.get(ch) + 1; // Shift the begin to next.
            }

            charIndex.put(ch, end);

            int length = end - begin + 1;
            
            if (length > max)
            {
                max = length;
            }
        }
        return max;
	}
}
