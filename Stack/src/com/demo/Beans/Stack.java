package com.demo.Beans;

import java.util.Arrays;

public class Stack 
{
	int top;	
	int [] arr;
	int size;
	public Stack(int n)
	{
		arr =new int [n];
		top=-1;
		size=n;
	}
	public int isEmpty()
	{
		if(top==-1)
		{
			return 1;			
		}
		else 
		{
			return -1;
		}
	}
	
	public int isFull()
	{
		if(top>=size-1)
		{
			return 1;			
		}
		else 
		{
			return -1;
		}
	}
	
	public void push(int num)
	{
		if(isFull()==1)
		{
			System.out.println("Stack Overflow");
		}
		else
		{
			top++;
			arr[top]=num;			
		}
	}
	
	public int pop()
	{
		
		if(isEmpty()==1)
		{
			System.out.println("Stack Underflow");
			return -1;
		}
		else 
		{
			int a=arr[top];
			top--;
			return a;
		}
	}
	public void Display()
	{
		System.out.println(Arrays.toString(arr));
	}

}
