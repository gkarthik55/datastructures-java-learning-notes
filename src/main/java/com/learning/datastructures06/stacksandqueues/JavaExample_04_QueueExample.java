package com.learning.datastructures06.stacksandqueues;

public class JavaExample_04_QueueExample
{
	public static void main(String[] args) 
	{
		Queue queue = new Queue();
		
		queue.enQueue(5);
		queue.enQueue(2);
		queue.enQueue(7);
		queue.enQueue(3);
		queue.enQueue(9);
		queue.enQueue(1);
		
		queue.show();
		
		queue.deQueue();
		queue.deQueue();
		queue.enQueue(12);
		queue.enQueue(25);
		
		queue.show();
	}
}
