package com.learning.datastructures02.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DsaExample_10_Arrays_InsertElementArrayList
{
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 6, 3, 2, 3));

		int element = 5;
		int position = 3;

		System.out.println("Original List: " + list);
		list.add(position, element); // insert at index

		System.out.println("After Insertion: " + list);
	}
}
