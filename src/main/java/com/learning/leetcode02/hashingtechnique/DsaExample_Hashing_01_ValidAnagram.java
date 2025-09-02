package com.learning.leetcode02.hashingtechnique;

import java.util.Arrays;

// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
//
// Example 1:
//
// Input: s = "anagram", t = "nagaram"
// Output: true
//
// Example 2:
//
// Input: s = "rat", t = "car"
// Output: false

public class DsaExample_Hashing_01_ValidAnagram
{
	public static void main(String[] args)
	{
		String  s = "rat", t = "car";
		
		System.out.println(isAnagram(s, t));
	}
	
	public static boolean isAnagram(String s, String t) 
	{ 
		int m = s.length();
		int n = t.length();
		
		//Check if the size is equals or not.
		if(m != n) 
		{
			return false;
		}
		
		//Create 26 letters box
		int characterCount[] = new int[26];
		
		//Count the Character from 's' Box.
		for(int i=0; i<m; i++)
		{
		  int index = s.charAt(i) - 'a';
		  characterCount[index] = characterCount[index] + 1;
		}
		
		System.out.println(Arrays.toString(characterCount));
		
		//Count the Character from 't' Box.
		for(int i=0; i<n; i++)
		{
		  int index = t.charAt(i) - 'a';
		  characterCount[index] = characterCount[index] - 1;
		}
		
		System.out.println(Arrays.toString(characterCount));
		
		for(int j=0; j<26; j++)
		{
			if(characterCount[j] != 0)
			{
				return false;
			}
		}
		
		return true;
	}
}
