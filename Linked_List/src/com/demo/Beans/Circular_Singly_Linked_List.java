package com.demo.Beans;

public class Circular_Singly_Linked_List 
{
	private Node head;
	class Node
	{
		int data;
		Node next;
		
		public  Node(int n)
		{
			data=n;
			next=null;
		}
		
	}
	
	public Circular_Singly_Linked_List()
	{
		head=null;
	}
	
	
	public void Add_at_Beginning(int n)
	{
		Node newnode=new Node(n);
		if(head==null)
		{
			System.out.println("List is empty");
			newnode.next=head;
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				temp=temp.next;
			}
			newnode.next=head;
			head=newnode;
			temp.next=head;
			
		}
		
	}
	
	public void Add_at_End(int n)
	{

		Node newnode=new Node(n);
		if(head==null)
		{
			System.out.println("List is empty");
			head=newnode;
			newnode.next=head;
		}
		else
		{
			Node temp=head;
			while(temp.next!=head)
			{
				  temp=temp.next;
			}
			
			temp.next=newnode;
			newnode.next=head;
		}
		
		
	}

	
	
	public void Add_at_Position(int n,int pos)
	{
		Node newnode=new Node(n);
		if(head==null)
		{
			System.out.println("List is empty");
			head=newnode;
			newnode.next=head;
		}
		if(pos==1)
		{
			Add_at_Beginning(n);
		}
		if(pos==2)
		{
			Node temp=head;
			newnode.next=temp.next;
			temp.next=newnode;
			
		}
		else
		{
			Node temp=head;
			int i=1;
			while(temp.next!=head && i<=pos-2)
			{
				temp=temp.next;
			}
			if(temp.next==head)
			{
				temp.next=newnode;
				newnode.next=head;
			}
			else
			{
				newnode=temp.next;
				temp.next=newnode;				
			}
			
		}

	}
	
	
	public void Display()
	{
		Node temp=head;
		while(temp.next!=head)
		{
			System.out.println(temp.data+"  ");
			temp=temp.next;
		}
	}
	
	
	
	
	
	
	
	
	
	
}
