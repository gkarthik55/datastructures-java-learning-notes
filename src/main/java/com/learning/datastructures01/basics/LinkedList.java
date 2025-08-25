package com.learning.datastructures01.basics;

public class LinkedList 
{
	Node head;
	
	//Method to Insert the data at the End.
	public void insert(int data)
	{
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		
		if(head == null)
		{
			head = node;
		}
		else
		{
			Node travNode = new Node();
			travNode = head;
			
			while(travNode.nextNode != null)
			{
				travNode = travNode.nextNode;
			}

			travNode.nextNode = node;
		}
	}
	
	//Method to Insert the data at the Start.
	public void insertAtStart(int data)
	{
		Node node = new Node();
		node.data = data;
		node.nextNode = head;
		
		head = node;
	}
	
	//Method to Insert the data at a Position.
	public void insertAtPos(int index, int data)
	{
		Node node = new Node();
		node.data = data;
		node.nextNode = null;
		
		if(index == 0)
		{
			insertAtStart(data);
			return;
		}
		
		Node travNode = head;
		for(int i=0;i<index-1;i++)
		{
			travNode = travNode.nextNode;
		}
		node.nextNode = travNode.nextNode;
		travNode.nextNode = node;
	}
	
	//Method to Delete the data at a Position.
	public void deleteAtPos(int index)
	{
		if(index == 0)
		{
			head = head.nextNode;
		}
		else
		{
			Node travNode = head;
			
			for(int i=0;i<index-1;i++)
			{
				travNode = travNode.nextNode;
			}
			
			Node nextNode = travNode.nextNode;
			travNode.nextNode = nextNode.nextNode;
			System.out.println("The deleted data is "+ nextNode.data);
			nextNode = null;// Nullify it, So that it is handled by Garbage collector.
		}
	}
	
	public void show()
	{
		Node node = new Node();
		node = head;
		
		while(node.nextNode != null)
		{
			System.out.println(node.data); 
			node = node.nextNode;
		}
		System.out.println(node.data);
	}
}
