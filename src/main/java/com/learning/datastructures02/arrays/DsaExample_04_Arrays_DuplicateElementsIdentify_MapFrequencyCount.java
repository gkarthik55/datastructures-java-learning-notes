package com.learning.datastructures02.arrays;

import java.util.HashMap;
import java.util.Map;

public class DsaExample_04_Arrays_DuplicateElementsIdentify_MapFrequencyCount
{
	public static void main(String[] args)
	{
		int[] array = {5, 3, 2, 1, 1, 5, 1, 5, 5, 2};

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // count frequency
        for (int num : array)
        {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // print duplicates only
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet())
        {
            if (entry.getValue() > 1)
            {
                System.out.println("Duplicate Element: " + entry.getKey() + 
                                   " (count = " + entry.getValue() + ")");
            }
        }
	}
}