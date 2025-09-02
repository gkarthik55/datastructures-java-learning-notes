package com.learning.datastructures11.arrays;

import java.util.Arrays;

public class DsaExample_11_Arrays_LargestAndSecondLargest
{
    public static void main(String[] args)
    {
        int[] numbers = {12, 93, 5, 12, 22, 38, 38, 5, 9, 94};
        System.out.println("Array: " + Arrays.toString(numbers));
        
        largestAndSecondLargestDistinct(numbers);
    }

    private static void largestAndSecondLargestDistinct(int[] array)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        
        for (int i = 1; i < array.length; i++)
        {
            int value = array[i];

            if (value > largest)
            {
                secondLargest = largest;
                largest = value;
            }
            else if (value < largest && value > secondLargest)
            {
                    secondLargest = value;
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest (distinct): " + secondLargest);
    }
}