package com.learning.leetcode03.prefixsum.pattern;

public class DsaExample_PrefixSum_01_RangeSumQuery
{
	static int prefixSum[];
	
	public static void main(String[] args)
	{
		int nums[] = {-2, 0, 3, -5, 2, -1};
						
		prefixSum = numArray(nums);

		int sum = sumRange(prefixSum, 0,2);
		int sum1 = sumRange(prefixSum, 2,5);
		int sum2 = sumRange(prefixSum, 0,5);
		
		System.out.println(" Sum 1: "+sum);
		System.out.println(" Sum 2: "+sum1);
		System.out.println(" Sum 3: "+sum2);
		
	}
	
    public static int[] numArray(int[] nums)
    {
    	for( int i=1; i<nums.length; i++)
    	{
    		nums[i] = nums[i-1] + nums[i];
    	}
    	
    	return nums;
    }
    
    public static int sumRange(int[] nums, int left, int right)
    {
    	if(left == 0)
    	{
    		return nums[right];
    	}
    	
    	return nums[right] - nums[left-1];
    }
}
