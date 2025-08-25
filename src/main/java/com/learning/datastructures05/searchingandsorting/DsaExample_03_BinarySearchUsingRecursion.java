package com.learning.datastructures05.searchingandsorting;

import java.util.Arrays;

public class DsaExample_03_BinarySearchUsingRecursion
{
    public static int binarySearchRecursive(int[] arr, int key, int begin, int end)
    {
        if (begin > end) return -1; // base case: not found

        int mid = (begin + end) / 2;

        if (arr[mid] == key)
        {
            return mid;
        } 
        else if (key < arr[mid])
        {
            return binarySearchRecursive(arr, key, begin, mid - 1);
        } 
        else 
        {
            return binarySearchRecursive(arr, key, mid + 1, end);
        }
    }

    public static void main(String[] args)
    {
        int[] arr = {3, 5, 8, 10};
        int key = 8;

        int index = binarySearchRecursive(arr, key, 0, arr.length - 1);

        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Key: " + key);
        System.out.println("Index: " + index);
    }
}