package com.learning.datastructures02.arrays;

import java.util.Arrays;

public class DsaExample_12_Arrays_LargestAndSmallest
{
    public static int[] minMax(int[] array)
    {
    		int temp[] = new int[2];
    		
    		int smallest = array[0];
    		int largest = array[0];
    		
    		for(int i=0 ; i<array.length; i++)
    		{
    			if(array[i] < smallest)
    			{
    				smallest = array[i];
    			}
    			
    			if(array[i] > largest)
    			{
    				largest = array[i];
    			}
    		}
    		
    		temp[0] = smallest;
    		temp[1] = largest;
    		return temp;
    }
    
	public static void main(String[] args)
	{
		int[] numbers = {55, 32, 45, 98, 82, 11, 9, 39, 50};

        int[] ans = minMax(numbers);

        System.out.println("Array: " + Arrays.toString(numbers));
        
        System.out.println("Smallest: " + ans[0]);
        System.out.println("Largest: " + ans[1]);
	}
}
