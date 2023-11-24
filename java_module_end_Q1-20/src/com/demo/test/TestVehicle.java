package com.demo.test;

import java.util.Scanner;
import com.demo.services.ServiceImpl;

public class TestVehicle {

	public static void main(String[] args) {
		ServiceImpl ob= new ServiceImpl();
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.print("1.Add new \n2.Search \n3.Exit\n");
			System.out.println("Enter choice: ");
			choice= sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Add new vehicle\n1.2w \n2. 4W");
				int c= sc.nextInt();
				ob.addNew(c);
				break;
			case 2:
				System.out.println("enter make: ");
				String make=sc.next();
				ob.search(make);
				break;
			case 3:
				System.out.println("enter price & type : ");
				int price=sc.nextInt();
				String type= sc.next();
				ob.bookVehicle(price, type);
				break;
			case 4:
				System.out.println("Thank you... ");
				break;
			default:
				System.out.println("wrong option !!!");
			}
			
		}while(choice!=4);

	}

}
