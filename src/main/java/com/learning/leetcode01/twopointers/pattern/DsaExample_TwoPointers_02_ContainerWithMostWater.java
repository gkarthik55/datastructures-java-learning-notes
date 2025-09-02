package com.learning.leetcode01.twopointers.pattern;

public class DsaExample_TwoPointers_02_ContainerWithMostWater
{
	public static void main(String[] args)
	{
		int[] nums = new int[] {1,8,6,2,5,4,8,3,7};
		
		maxArea(nums);
	}
	
    public static void maxArea(int[] height) 
    {
    	int len = height.length;
    	
    	int left = 0;
    	int right = len-1;
    	
    	int area=0;
    	int maxWater = 0; 
    	
    	while(left < right)
    	{
        	int width = right - left;

        	area = Math.min(height[left], height[right]) * width;

        	maxWater = Math.max(area, maxWater);
        	
        	System.out.println(" Area :"+ area);
        	
        	if(height[left]< height[right])
        	{
        		left++;
        	}
        	else
        	{
        		right--;
        	}
    	}
    	
    	System.out.println("MaxWater :"+maxWater);
    }

    public static void maxAreaBruteForce(int[] height) 
    //Just to understand how to get all pairs and do the calculation.
    {
    	int maxWater = 0;
    	
    	int len = height.length;
    	
    	for(int i=0; i<len; i++) 
    	{
    		for(int j=i+1; j<len; j++) 
    		{
    			// To Print the Pairs
    			//System.out.println("Pairs : "+height[i]+" : "+height[j]);
    			
    			int width = j - i;
    			int minHeight = Math.min(height[i], height[j]);
    			
    			int area = minHeight * width;
    			
    			maxWater = Math.max(maxWater, area);
    		}
    	}
    	
    	System.out.println("MaxWater :"+maxWater);
    }
}
