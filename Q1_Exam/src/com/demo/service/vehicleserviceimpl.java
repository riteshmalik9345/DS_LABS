package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import com.demo.beans.FourWheeler;
import com.demo.beans.TwoWheeler;
import com.demo.beans.Vehicle;
import com.demo.dao.Vehicledao;
import com.demo.dao.Vehicledaoimpl;

public class vehicleserviceimpl implements vehicleservice {
	private Vehicledao vdao;
	public vehicleserviceimpl() {
		vdao=new Vehicledaoimpl();
	}
     
	@Override
	public void addnewVehicle(int ch) {
			Scanner sc=new Scanner(System.in);
			System.out.println("enter id");
			int id=sc.nextInt();
			System.out.println("enter ownername");
			String nm=sc.next();
			System.out.println("enter Type");
			String type=sc.next();
			System.out.println("enter salesman name");
			String snm=sc.next();
			System.out.println("enter model");
			String model=sc.next();
			System.out.println("enter price");
			double price=sc.nextDouble();
			System.out.println("enter status");
			String status=sc.next();
			System.out.println("enter date of joining(dd/MM/yyyy)");
			String dt=sc.next();
			LocalDate ldt=LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
			Vehicle v=null;
			if(ch==1) {
				System.out.println("enter dickycapacity");
				double dc=sc.nextDouble();
				v=new TwoWheeler(id,nm,ldt,type,snm,model,price,status,dc);
			}
			else if (ch==2) {
				System.out.println("enter engine type");
				String et=sc.next();
				System.out.println("enter gear type");
				String gt=sc.next();
				v=new FourWheeler(id,nm,ldt,type,snm,model,price,status,et,gt);
			}
			vdao.save(v);
	}

	@Override
	public Vehicle searchbymodel(String model) {
		// TODO Auto-generated method stub
		return vdao.searchbymodel(model);
	}

	@Override
	public boolean book(int choice, double pri) {
		// TODO Auto-generated method stub
		return vdao.book(choice,pri);
	}

}
