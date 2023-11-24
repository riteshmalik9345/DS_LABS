package com.demo.test;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

import com.demo.beans.Vehicle;
import com.demo.service.vehicleservice;
import com.demo.service.vehicleserviceimpl;


public class TestVehicle {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				vehicleservice vs=new vehicleserviceimpl();
				int choice=0;
				do {
				System.out.println("1. Add new Vehicle\n2.Search Vehicle on Model\n3.Book Vehicle");
				System.out.println("4. exit\n choice:");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					System.out.println("1.Two Wheeler\n2.Four Wheeler");
					int ch=sc.nextInt();
					vs.addnewVehicle(ch);
					break;
				case 2:
					System.out.println("Enter Model to Search");
					String model=sc.next();
					Vehicle v=vs.searchbymodel(model);
					System.out.println(v);
					break;

				case 3:
					System.out.println("Book Vehicle");
					String mod=sc.next();
					System.out.println("1.Two Wheeler\n2.Four Wheeler");
					double pri=sc.nextDouble();
					System.out.println("1.Two Wheeler\n2.Four Wheeler");
					choice=sc.nextInt();
					boolean status=vs.book(choice,pri);
					if(status) {
						System.out.println("modified successfully");
					}
					else {
						System.out.println("not found");
					}
					break;	
				case 4:
					sc.close();
					System.out.println("Thank you for visiting....");
					break;
				default:
					System.out.println("wrong choice");
				}
				}while(choice!=4);

		}

	}
