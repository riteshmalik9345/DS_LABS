package com.demo.Beans;

public class Singly_Linked_list 
{
	private Node head;
	private class Node
	{
		int data;
		Node next;
		private Node(int n)
		{
			data =n;
			next=null;
		}
	
	}
		
	public Singly_Linked_list()
	{
		head=null;
	}
	public void Add_at_Beginning(int n)
		{
		Node newnode=new Node(n);
			if(head==null)
			{
				head=newnode;
				System.out.println(n+" is added in the list as first node.");
			}
			else
			{
				newnode.next=head;
				head=newnode;
				System.out.println(n+" is added in the list at beginning.");

			}
			
		}
		
	public void Add_at_End(int n)
	{
		Node newnode=new Node(n);
		if(head==null)
		{
			System.out.println("List is empty.\n"+n+" is added at the beginning.");
			head=newnode;
		}
		else
		{
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			System.out.println(n+" is added in the list at the end.");
			temp.next=newnode;
		}
	}
	
	public void Add_at_Position(int n,int pos)
	{
		Node newnode=new Node(n);
		if(head==null && pos!=1)
		{
			System.out.println("List is empty.\nCannot add at "+pos+" position.");
			System.out.println("So adding "+n+" at first position.");
			Add_at_Beginning(n);
		}
		else
		{
			Node temp=head;
			int i=1;
			while(i<=pos-2)
			{
				temp=temp.next;
				i++;
			}
			newnode.next=temp.next;
			temp.next=newnode;
		}
		
	}
	
	public void Delete_from_Beginning()
	{
		
		if(head==null)
		{
			System.out.println("Cannot delete node because list is empty.");
		}
		else
		{
			
			head=head.next;
			System.out.println("First node deleted from the list.");
		}
	}
	
	public void Delete_from_End()
	{
		if(head==null)
		{
			System.out.println("Cannot delete node because list is empty.");
		}
		else
		{
			Node temp=head;
			while(temp.next.next!=null)
			{
				temp=temp.next;
			}
			temp.next=null;
			
			
		}
	}
		
	public void Delete_by_Position(int pos)
	{
		if(head==null)
		{
			System.out.println("Cannot delete node because list is empty.");
		}
		else
		{
			Node temp=head;
			int i=1;
			while(i<=pos-2)
			{
				temp=temp.next;
				i++;
			}
			temp.next=temp.next.next;
			
		}
		
	}
	
	public void Delete_by_Value(int value)
	{
		if(head==null)
		{
			System.out.println("Cannot delete node because list is empty.");
		}
		
		else
		{
			boolean flag=false;
			Node temp=head;
			while(temp!=null)
			{
				if(temp.data==value)
				{
					head=temp.next;
					break;
				}
				if(temp.next.data==value)
				{
					flag=true;
					break;					
				}
				temp=temp.next;
			}
			
			if(flag==true)
			{
				temp.next=temp.next.next;				
			}
			else
				System.out.println("Value not found in the list");
		}
	}
	
	
	public void Search_by_Value(int value)
	{
		if(head==null)
		{
			System.out.println("Cannot delete node because list is empty.");
		}
		else 
		{
			Node temp=head;
			boolean flag=false;
			int i=1;
			while(temp!=null)
			{
				if(value==temp.data)
				{
					flag=true;
					break;
				}
				temp=temp.next;
				i++;
			}
			
		if(flag==true)
			System.out.println("Value found at "+i+" position");
		else
			System.out.println("Value not found not in the list.");
			
			
		}
	}
	
	
	
	public void Display()
	{
		Node temp=head;
		System.out.println();
		System.out.println("List :");
		while(temp!=null)
		{
			System.out.print(temp.data+"  ");
			temp=temp.next;
		}

		System.out.println();
		System.out.println();
	}
		
		
}
