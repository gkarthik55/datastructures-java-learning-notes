package com.learning.datastructures14.searchingandsorting;

import java.util.Arrays;

public class DsaExample_01_LinearSearch
{
    // Returns index if found, else -1
    public static int linearSearch(int[] arr, int key)
    {
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == key)
            {
                return i; // stop at first occurrence
            }
        }
        return -1; // not found
    }

    public static void main(String[] args)
    {
        int[] arr = {12, 5, 8, 10, 2, 56};
        int key = 2;

        int idx = linearSearch(arr, key);

        System.out.println("Array: " + Arrays.toString(arr));
        if (idx != -1) {
            System.out.println("Element " + key + " found at index: " + idx);
        } else {
            System.out.println("Element " + key + " not found.");
        }
    }
}