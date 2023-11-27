package com.demo;

import java.util.Arrays;

public class TestQueue {
	public static void main(String[] args) {
		Queue ob = new Queue(5);
		ob.add(10);
		ob.add(45);
		ob.add(42);
		
		System.out.println(Arrays.toString(ob.getArr()));
		while (!ob.isEmpty()) {
			// System.out.println(ob.peek());
			System.out.println(ob.remove() + " removed");

		}
	}
}
