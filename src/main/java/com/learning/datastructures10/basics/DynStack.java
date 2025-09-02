package com.learning.datastructures10.basics;

public class DynStack 
{
	int capacity = 2;
	int stack[] = new int[capacity];
	int top = 0;

	public void Push(int data)
	{
		if(size() == capacity)
		{
			expand();
		}
		
		stack[top] = data;
		top++;
	}
	
	private void expand()
	{
		int length = size();
		int newStack[] = new int[length*2];
		
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
		capacity  = capacity*2;
	}
	
	public void Pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty!");
		}
		else
		{
			System.out.println("Popped Element: "+stack[top-1]);
			stack[top-1]=0;
			top--;
			Shrink();
		}
	}
	
	private void Shrink() 
	{
		int length = size();
		
		if(length <= (capacity/2)/2 )//Kaal baga edre arda maadu
		{
			capacity = capacity/2;
		}
		
		int newStack[] = new int[capacity];
		System.arraycopy(stack, 0, newStack, 0, length);
		stack = newStack;
	}

	public void Peek()
	{
		if(isEmpty())
		{
			System.out.println("Stack is Empty!");
		}
		else
		{
			System.out.println("Popped Element: "+stack[top-1]);
		}
	}
	
	public boolean isEmpty()
	{
		return top<=0;
	}
	
	public int size()
	{
		return top;
	}
	
	public void show()
	{
		System.out.println("Stack Values:");
		for(int i:stack)
		{
			System.out.print(" "+i + "\t");
		}
	}
}
