package com.demo.beans;
import java.util.*;

public class QueueLL {
 class Node{
	 private Employee[] e;
	 Node next;
	 
	 Node(Employee[] e2){
		 this.e=e2;
		 next=null;
	 }
 }
 
 private Node front;
 private Node rear;
 public QueueLL() {
	 front=null;
	 rear=null;
 }
 
 public boolean isEmpty() {
	 return front==null && rear==null;
 }

public void insertEmployee() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter id:");
	int id=sc.nextInt();
	System.out.println("enter name:");
	String s=sc.next();
	System.out.println("enter gender:");
	String g=sc.next();
	if(isEmpty()) {
   Node nn=new Node();
	  front=nn;
		  
	  }else {
		  Node t=rear;
		  while(t.next!=null) {
			  rear=rear.next;
		  }
		 // t=nn;
	  }
	}

public void deleteByid(int id) {
	
	if(isEmpty()) {
		System.out.println("queue is empty");
	} else {
		while(front!=null) {
			front=null;
		}
	}
}

public void insertEmployee(int id) {
	// TODO Auto-generated method stub
	
}

public void deleteByid() {
	// TODO Auto-generated method stub
	
}

public void printMale() {
	// TODO Auto-generated method stub
	
}

public void printFemale() {
	// TODO Auto-generated method stub
	
}

public void dequeue() {
	// TODO Auto-generated method stub
	
}

public void reverseOrder() {
	// TODO Auto-generated method stub
	
}
	
}
 
 

