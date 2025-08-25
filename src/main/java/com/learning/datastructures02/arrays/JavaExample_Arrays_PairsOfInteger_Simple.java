package com.learning.datastructures02.arrays;

import java.util.Arrays;

public class JavaExample_Arrays_PairsOfInteger_Simple 
{
	public static void main(String[] args) 
	{
		int arr[] = { 2, 5, 1, 6, 8, -1 };

		int sum = 7;
		int len = arr.length;
		
		Arrays.sort(arr);
		//{ -1, 1, 2, 5, 6, 8 }
		
		for(int i=0; i<len; i++)
		{
			int a = arr[i];//-1
			int b = sum - a;//6
			
			for(int j=i+1; j<len; j++)
			{
				if(arr[j] == b)
				{
					System.out.println("The Pair is "+a+" "+b);
				}
			}
		}
		
		System.out.println("");
	}
}
