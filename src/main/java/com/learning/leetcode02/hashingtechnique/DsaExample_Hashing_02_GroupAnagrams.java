package com.learning.leetcode02.hashingtechnique;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DsaExample_Hashing_02_GroupAnagrams
{
	public static void main(String[] args)
	{
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		groupAnagrams(strs);
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) 
	{ 
		List<List<String>> arrList = new ArrayList<List<String>>();
		
		
		Map<String, List<String>> hashMap = new HashMap<>();
		
		for(String str : strs)
		{
			String sortedStr = sort(str);
			
			List<String> stringList = hashMap.get(sortedStr);
					
			if(stringList == null)
			{
				stringList = new ArrayList<>();
				stringList.add(str);
				
				hashMap.put(sortedStr, stringList);
			}
			else
			{
				stringList.add(str);
				hashMap.put(sortedStr, stringList);
			}
		}
		
		for(Map.Entry<String, List<String>> entry :  hashMap.entrySet())
		{
			arrList.add(entry.getValue());
			System.out.println(entry.toString());
		}
		
		return arrList;
	}
	
	public static String sort(String str)
	{
		char[] charArr = str.toCharArray();
		Arrays.sort(charArr);

		return Arrays.toString(charArr);		
	}
}
