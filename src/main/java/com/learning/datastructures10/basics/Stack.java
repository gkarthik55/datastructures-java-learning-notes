package com.learning.datastructures10.basics;

public class Stack 
{
	int stack[] = new int[5];
	int top = 0;
	
	public void Push(int data)
	{
		if(top == 5)
		{
			System.out.println("Overflow. Stack is Full!");
		}
		else
		{
			stack[top] = data;
			top++;
		}
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
		}
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
	
	public void show()
	{
		System.out.println("Stack Values:");
		for(int i:stack)
		{
			System.out.println("Value :"+i);
		}
	}
}
