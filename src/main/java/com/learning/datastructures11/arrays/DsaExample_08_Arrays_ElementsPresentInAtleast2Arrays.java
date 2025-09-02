package com.learning.datastructures11.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DsaExample_08_Arrays_ElementsPresentInAtleast2Arrays
{
    // Map to store element and its frequency across arrays
    private static Map<Integer, Integer> elementCountMap = new HashMap<>();

    private static void addElementsFromArray(int[] array)
    {
        // Use a Set to avoid counting duplicates within the same array
        Set<Integer> uniqueInThisArray = new HashSet<>();

        for (int num : array)
        {
            uniqueInThisArray.add(num);
        }

        for (int num : uniqueInThisArray)
        {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1, 2, 3, 9, 8, 7};
        int[] arr2 = {4, 1, 2, 10, 15};
        int[] arr3 = {5, 1, 2, 4, 10};

        addElementsFromArray(arr1);
        addElementsFromArray(arr2);
        addElementsFromArray(arr3);

        System.out.println("Elements present in at least 2 arrays:");

        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet())
        {
            if (entry.getValue() >= 2)
            {
                System.out.println(entry.getKey() + " (present in " + entry.getValue() + " arrays)");
            }
        }
    }
}