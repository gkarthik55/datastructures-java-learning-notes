package com.learning.datastructures11.arrays;

import java.util.HashMap;
import java.util.Map;

public class DsaExample_05_Arrays_DuplicateElementsIdentify_Names_Hashmap {
	// Find the Duplicate Name in an Array.

	// Third solution : using HashMap data structure to find duplicates
	// Time complexity of this solution is O(2n) and Space complexity of O(n)

	public static void main(String[] args) {
		String[] names = { "Java", "C++", "C", "Scala", "Java", "Java8", "C++", "C#" };

		Map<String, Integer> nameAndCount = new HashMap<String, Integer>();

		for (int i = 0; i < names.length; i++) 
		{
			Integer count = nameAndCount.get(names[i]);

			if (count == null) 
			{
				nameAndCount.put(names[i], 1);
			} 
			else 
			{
				nameAndCount.put(names[i], ++count);
			}
		}

		// Now looping through the nameAndCount and finding the count more than 1.
		for (Map.Entry<String, Integer> mapEntry : nameAndCount.entrySet())
		{
			if (mapEntry.getValue() > 1) {
				System.out.println("Duplicate Element is " + mapEntry.getKey());
			}
		}
	}
}
