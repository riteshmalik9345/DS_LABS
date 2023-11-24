package com.demo.services;

import com.demo.dao.daoImpl;

public class ServiceImpl {
	daoImpl dao= new daoImpl();
	
	public void addNew(int ch) {
		dao.save(ch);
	}
	
	public void search(String make) {
		dao.find(make);
	}
	
	public void bookVehicle(int price,String type) {
		dao.book(price, type);
	}
}
