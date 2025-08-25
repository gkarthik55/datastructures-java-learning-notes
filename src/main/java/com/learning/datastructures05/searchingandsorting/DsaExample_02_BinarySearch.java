package com.learning.datastructures05.searchingandsorting;

import java.util.Arrays;

public class DsaExample_02_BinarySearch
{
    public static int binarySearch(int[] arr, int key)
    {
        int begin = 0, end = arr.length - 1;

        while (begin <= end)
        {
            int mid = begin + (end - begin) / 2;

            if (arr[mid] == key)
            {
                return mid; // found
            }
            else if (arr[mid] < key)
            {
                begin = mid + 1; // search right half
            }
            else
            {
                end = mid - 1; // search left half
            }
        }
        return -1; // not found
    }

    public static int firstOccurrence(int[] arr, int key)
    {
        int begin = 0, end = arr.length - 1, occurance = -1;
        
        while (begin <= end)
        {
            int mid = (begin + end) / 2;
            
            if (key <= arr[mid])
            {
               if (key == arr[mid]) 
               {
                	 occurance = mid; // record and go left
               }
               end = mid - 1;
            }
            else
            {
                begin = mid + 1;
            }
        }
        return occurance;
    }

    public static void main(String[] args)
    {
        int[] arr = {10, 20, 30, 40, 50};
        int key = 30;

        int index = binarySearch(arr, key);
        
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Key: " + key);
        System.out.println("Index (any): " + index);

        // With duplicates
        int[] arr2 = {1, 2, 2, 2, 3, 4};
        System.out.println("First occurrence of 2: " + firstOccurrence(arr2, 2)); // 1
    }
}