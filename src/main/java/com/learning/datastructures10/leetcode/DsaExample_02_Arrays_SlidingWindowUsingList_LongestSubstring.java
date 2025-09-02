package com.learning.datastructures10.leetcode;

import java.util.ArrayList;
import java.util.List;

// 2. Longest Substring Without Repeating Characters
// Given a string s, find the length of the longest substring without duplicate characters.
// 
// Example 1:
//
// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// 

public class DsaExample_02_Arrays_SlidingWindowUsingList_LongestSubstring
{
	public static void main(String[] args)
	{
		String str = "pwwkew";
		System.out.println("Result: " + longestSubstring(str));
	}

	public static int longestSubstring(String s)
	{
		int begin = 0;
        int end = 0;
        int len = s.length();

        char[] charArr = s.toCharArray();

        int maxLength = 0;
        List<Character> charList = new ArrayList<Character>();

        while (end < len)
        {
            Character ch = charArr[end];

            if (!charList.contains(ch))
            {
                charList.add(ch);
                end++;
                maxLength = Math.max(maxLength, charList.size());
            }
            else
            {
                // key change: remove from the LEFT until 'ch' is not in window
                while (charList.contains(ch))
                {
                    charList.remove(0);
                    begin++;
                }
            }
        }

		return maxLength;
	}
}
