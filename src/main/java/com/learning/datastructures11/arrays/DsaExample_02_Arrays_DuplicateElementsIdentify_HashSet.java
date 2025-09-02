package com.learning.datastructures11.arrays;

import java.util.HashSet;
import java.util.Set;

public class DsaExample_02_Arrays_DuplicateElementsIdentify_HashSet
{
    public static void main(String[] args)
    {
        int[] array = {5, 3, 2, 1, 1, 5, 1};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : array)
        {
            if (!seen.add(num)) // if already present
            {
                duplicates.add(num);
            }
        }

        if (duplicates.isEmpty())
        {
            System.out.println("No duplicates found.");
        }
        else
        {
            System.out.println("Duplicate Elements: " + duplicates);
        }
    }
}
