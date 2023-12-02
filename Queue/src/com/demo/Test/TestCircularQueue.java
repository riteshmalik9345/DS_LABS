package com.demo.Test;

import com.demo.Beans.CircularQueue;

public class TestCircularQueue 
{
	public static void main(String[] args)
	{
		CircularQueue cq = new CircularQueue();
		cq.enqueue(10);
		cq.enqueue(20);
		cq.enqueue(30);
		cq.enqueue(40);
		cq.enqueue(50);
		cq.enqueue(60);
		cq.enqueue(70);
		cq.enqueue(80);
		cq.enqueue(90);
		cq.enqueue(100);
		cq.enqueue(10);
		
		cq.Display();
		
		
		cq.dequeue();		
		cq.dequeue();		
		cq.dequeue();		
		cq.dequeue();		
		cq.dequeue();		
		
		
		cq.enqueue(11);
		cq.enqueue(22);
		cq.enqueue(33);
		cq.enqueue(44);
		cq.enqueue(55);
		cq.enqueue(66);
		
		cq.Display();
		
		
	}

}
