package com.learning.leetcode02.slidingwindow.pattern;

import java.util.HashMap;
import java.util.Map;

// Given a string s, find the length of the longest substring without duplicate characters.
//
// Example 1:
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// 
public class DsaExample_SlidingWindow_02_LongestSubstringWithoutRepeatingCharacters
{
	public static void main(String[] args)
	{
		String str = "abba";
		
		System.out.println(lengthOfLongestSubstring(str));
	}
	
    public static int lengthOfLongestSubstring(String s)
    {
        Map<Character, Integer> charIndex = new HashMap<>();
        int left = 0;
        int maxLength = 0;

        // Expand the Window by moving 'Right'
        for (int right = 0; right < s.length(); right++)
        {
            char ch = s.charAt(right);

            //"abba"
            if (charIndex.containsKey(ch) && charIndex.get(ch) >= left)
            {
                left = charIndex.get(ch) + 1; // Shift the left to next.
            }

            charIndex.put(ch, right);

            int length = right - left + 1;
            
            if (length > maxLength)
            {
            	maxLength = length;
            }
        }
        
        return maxLength;
    }
}
