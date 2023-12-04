package com.demo.test;
import com.demo.beans.*;
import java.util.*;


public class TestEmployee {
public static void main(String[] args) {
	QueueLL q=new QueueLL();
	
	Scanner sc=new Scanner(System.in);
	int choice=0;
	System.out.println("Menu Driven");
	do {
		System.out.println("1.Insert Employee\n2.RemoveEmployee\n3.Print Queue\n4.print all female\n5.print all male\n6.Empty the queue\n7.Print queue in reverse\n");
		System.out.println("Enter the choice:");
        choice=sc.nextInt();
		switch(choice) {
		case 1:
			q.insertEmployee();
			break;
		case 2:
			//System.out.println("enter employee id to be deleted");
			q.deleteByid();
			break;
		case 3:
			q.printFemale();
			break;
		case 4:
			q.printMale();
			break;
		case 5:
			q.dequeue();
			break;
		case 6:
			q.reverseOrder();
			break;
		case 7:
			break;
			default:
				System.out.println("End");
		}
		
	}while(choice!=7);
}
}
