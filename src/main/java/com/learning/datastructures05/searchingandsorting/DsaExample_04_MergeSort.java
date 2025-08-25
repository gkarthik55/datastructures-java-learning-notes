package com.learning.datastructures05.searchingandsorting;

public class DsaExample_04_MergeSort  
{  
	static void merge(int arr[], int begin, int mid, int end)  
	{  
	  
		int l = mid - begin + 1;  
		int r = end - mid;  
		  
		int LeftArray[] = new int [l];  
		int RightArray[] = new int [r];  
		  
		for (int i=0; i<l; ++i)  
		LeftArray[i] = arr[begin + i];  
		  
		for (int j=0; j<r; ++j)  
		RightArray[j] = arr[mid + 1+ j];  
		  
		  
		int i = 0, j = 0;  
		int k = begin;  
		while (i<l && j<r)  
		{  
			if (LeftArray[i] <= RightArray[j])  
			{  
				arr[k] = LeftArray[i];  
				i++;  
			}  
			else  
			{  
				arr[k] = RightArray[j];  
				j++;  
			}  
			k++;  
		}  
		
		while (i<l)  
		{  
			arr[k] = LeftArray[i];  
			i++;  
			k++;  
		}  
		  
		while (j<r)  
		{  
			arr[k] = RightArray[j];  
			j++;  
			k++;  
		}  
    }  
	  
	static void sort(int arr[], int beg, int end)  
	{  
		if (beg<end)  
		{  
			int mid = (beg+end)/2;  
			sort(arr, beg, mid);  
			sort(arr , mid+1, end);  
			merge(arr, beg, mid, end);  
		}  
	 }  
	public static void main(String args[])  
	{  
		int arr[] = {8, 5, 9, 1, 6, 7};
		
		DsaExample_04_MergeSort.sort(arr, 0, arr.length-1);  
		  
		System.out.println("\nSorted array");  
		for(int i =0; i<arr.length;i++)  
		{  
		    System.out.println(arr[i]+"");  
		}  
	}  
}  