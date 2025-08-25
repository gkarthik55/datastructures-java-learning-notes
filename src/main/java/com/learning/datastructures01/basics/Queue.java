package com.learning.datastructures01.basics;

public class Queue 
{
	int front, rear = 0;
	int size = 0;
	int queue[] = new int[5];
	
	public void enQueue(int data)
	{
		if(!isFull())
		{
			queue[rear]=data;
			rear = (rear+1) % 5; // When we are in 5th element and
			// it is deleted and want to insert it there. Do a Modulo.
			
			size = size+1; 
		}
		else
		{
			System.out.println("Queue is full");
		}

	}
	
	public int deQueue()
	{
		int data = queue[front];
		
		if(!isEmpty())
		{
			front = (front +1)%5;
			size = size - 1;
		}
		else 
		{
			System.out.println("Queue is Empty");
		}
		
		return data;
	} 
	
	public int getSize()
	{
		return size;
	}
	
	public boolean isEmpty()
	{
		return size==0;
	}
	
	public boolean isFull()
	{
		if (size == 5)
			return true;
		else 
			return false;
	}
	
	public void show()
	{
		System.out.println("Below is the Queue Elements: \n");
		for(int i=0; i<size; i++)
		{
			System.out.print(queue[(front + i) % 5] + " ");
		}
		
		System.out.println("\nOriginal Queue :");
		for(int n: queue)
		{
			System.out.print(n+ " ");
		}
	}
}
