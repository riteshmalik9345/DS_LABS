package com.demo.Test;

import java.util.Arrays;
import java.util.Scanner;

import com.demo.Beans.MyQueue;

public class TestQueue 
{
	public static void main(String [] args)
	{
		Scanner s =new Scanner(System.in);

		int size1;
		System.out.print("Enter the size of queue : ");
		size1=s.nextInt();
		
		//MyQueue mq1 = new MyQueue();
		MyQueue mq2=new MyQueue(size1);
		
		mq2.Enqueue(10);
		mq2.Enqueue(20);
		mq2.Enqueue(30);
		mq2.Enqueue(40);
		mq2.Enqueue(50);
		mq2.Enqueue(10);
		
		mq2.Display();
		
		System.out.println(mq2.Dequeue());
		System.out.println(mq2.Dequeue());
		System.out.println(mq2.Dequeue());
		System.out.println(mq2.Dequeue());
		System.out.println(mq2.Dequeue());
		mq2.Dequeue();
		
		mq2.Enqueue(55);
		mq2.Enqueue(66);
		mq2.Enqueue(77);
		mq2.Enqueue(88);
		
		System.out.println(mq2.Dequeue());
		System.out.println(mq2.Dequeue());
		System.out.println(mq2.Dequeue());
		System.out.println(mq2.Dequeue());
		mq2.Dequeue();
		
		mq2.Enqueue(101);
		mq2.Enqueue(102);
		mq2.Enqueue(103);
		mq2.Enqueue(104);
		mq2.Enqueue(105);
		
		mq2.Display();
		

	}
	

}
