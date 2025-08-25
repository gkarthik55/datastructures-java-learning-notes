package com.learning.datastructures01.basics;

public class JavaExample_03_DynStackExample
{
	public static void main(String[] args) 
	{
		DynStack obj = new DynStack();
		
		//Push Elements
		obj.Push(5);
		obj.Push(12);
		obj.Push(3);
		obj.Push(10);
		obj.Push(7);
		obj.Push(25);
		
		obj.show();
		
		obj.Pop();
		obj.Pop();
		obj.Pop();
		obj.Pop();
		
		obj.show();
	}
}
