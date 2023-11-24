package com.demo.test;

import java.util.Scanner;

import com.demo.dao.daoImpl;

public class TestHashMap {

	public static void main(String[] args) {
		daoImpl ob= new daoImpl();
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("1.Add new \n2.Display \n3.Exit\n");
			System.out.println("Enter choice: ");
			choice= sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter course name & duration in days");
				String course= sc.next();
				int days= sc.nextInt();
				ob.save(course,days);
				break;
			case 2:
				ob.display();
				break;
			case 3:
				ob.writeFile();
				System.out.println("Thank you...");
				break;
			default:
				System.out.println("wrong option !!!");
			}
			
		}while(choice!=3);

	}

}
