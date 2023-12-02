package com.demo.Beans;

import java.util.Arrays;

public class MyQueue 
{
	private int []arr;
	private int size;
	private int front;
	private int rear;
	
	
	public MyQueue()
	{
		
		size=10;
		arr=new int[size]; 
		front=-1;
		rear=-1;
		
	}
	
	public MyQueue(int n)
	{
		arr=new int[n];
		size=n;
		front=-1;
		rear=-1;
	}
	
	
	public boolean isEmpty()
	{
		if((front==-1 && rear==-1)||front>rear)
		{
			front=-1;
			rear=-1;
			
			return true;
		}
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(front==0 && rear==size-1 )
		{
			
			return true;
		}
		else
			return false;
		
	}
	
	public void Display()
	{
		System.out.println(Arrays.toString(arr));
	}
	
	public void Enqueue(int num)
	{
		if(isFull()==true)
		{
			System.out.println("Queue is full");
		}
		else 
		{
			if(front==-1)
				front++;
			rear++;
			arr[rear]=num;
		}
	}
	
	public int Dequeue()
	{
		
		if(isEmpty()==true)
		{
			System.out.println("Queue is empty");
			return -1;
		}
		else 
		{
			int value=arr[front];
			front++;
			return value;
		}
		
	}
	
	
	
	
	
	
}
