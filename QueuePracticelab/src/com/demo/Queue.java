package com.demo;

import java.util.Arrays;

class Queue {
	static int arr[];
	static int size;
	static int rear = -1;
	static int front = 0;

	Queue(int n) {
		arr = new int[n];
		size = n;
	}

	
	public static int[] getArr() {
		return arr;
	}

	public static boolean isEmpty() {
		return rear < front;
	}
	
	public boolean isFull() {
		return rear == size - 1;
	}

//     enqueue
	public static void add(int data) {
		if (rear == size - 1) {
			System.out.println("queue is FULL !!!");
		} else {
			rear++;
			arr[rear] = data;
		}
	}
	// dequeue

	public static int remove() {
		if (isEmpty()) {
			System.out.println("queue is EMPTY !!!");
			return -1;
		}
		int n = arr[front];
		front++;
		return n;
	}

//    peek
	public static int peek() {
		if (isEmpty()) {
			System.out.println("queue is EMPTY !!!");
			return -1;
		}
		return arr[0];
	}

}
