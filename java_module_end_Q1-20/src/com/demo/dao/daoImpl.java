package com.demo.dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.FourWheeler;
import com.demo.beans.TwoWheeler;
import com.demo.beans.Vehicle;

public class daoImpl {
	Vehicle v = null;
	static TreeSet<Vehicle> ts;
	static {
		ts = new TreeSet<>();

		ts.add(new FourWheeler(1, "om", LocalDate.parse("22/05/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				"electric", "ramesh", "TATA", "T101", 45000, "Available", "normal", "hybrid"));
		ts.add(new TwoWheeler(2, "vikki", LocalDate.parse("11/11/2023", DateTimeFormatter.ofPattern("dd/MM/yyyy")),
				"non-electric", "suresh", "OLA", "Ol69", 25000, "Available", 500));
	}

	public void save(int ch) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter vid:");
		int vid = sc.nextInt();
		System.out.println("enter owner:");
		String owner = sc.next();
		System.out.println("enter dom :");
		String dom = sc.next();
		System.out.println("enter type :");
		String type = sc.next();
		System.out.println("enter salemanname:");
		String salesmanname = sc.next();
		System.out.println("enter make:");
		String make = sc.next();
		System.out.println("enter model:");
		String model = sc.next();
		System.out.println("enter price:");
		int price = sc.nextInt();
		System.out.println("enter status:");
		String status = sc.next();
		switch (ch) {
		case 1: // 2 wheeler
			System.out.println("enter dicky_cap:");
			int dicky_cap = sc.nextInt();
			v = new TwoWheeler(vid, owner, LocalDate.parse(dom, DateTimeFormatter.ofPattern("dd/MM/yyyy")), type,
					salesmanname, make, model, price, status, dicky_cap);
			break;
		case 2: // 4 wheeler
			System.out.println("enter engine_type :");
			String engine_type = sc.next();
			System.out.println("enter gear_type:");
			String gear_type = sc.next();
			v = new FourWheeler(vid, owner, LocalDate.parse(dom, DateTimeFormatter.ofPattern("dd/MM/yyyy")), type,
					salesmanname, make, model, price, status, engine_type, gear_type);
			break;
		}

		ts.add(v);
	}

	public void find(String make) {
		List<Vehicle> lst = new ArrayList<>();
		for (Vehicle m : ts) {
			if (m.getMake().equals(make)) {
				lst.add(m);
			}
		}
		System.out.println(lst);
	}

	public void book(int price, String type) {
		for (Vehicle m : ts) {
			if (m.getType().equals(type) && m.getPrice() < price) {
				System.out.println(m.getModel() + " " + m.getType() + " " + m.getPrice() + " " + m.getStatus());
			}
		}
	}

}
