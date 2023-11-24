package com.demo.beans;

import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle>{
	private int vid;
	private String owner;
	private LocalDate dom;
	private String type;
	private String salesmanname;
	private String make;
	private String model;
	private int price;
	private String status;
	
	public Vehicle(int vid, String owner, LocalDate dom, String type, String salesmanname, String make, String model,
			int price, String status) {
		this.vid = vid;
		this.owner = owner;
		this.dom = dom;
		this.type = type;
		this.salesmanname = salesmanname;
		this.make = make;
		this.model = model;
		this.price = price;
		this.status = status;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public LocalDate getDom() {
		return dom;
	}

	public void setDom(LocalDate dom) {
		this.dom = dom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getSalesmanname() {
		return salesmanname;
	}

	public void setSalesmanname(String salesmanname) {
		this.salesmanname = salesmanname;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", owner=" + owner + ", dom=" + dom + ", type=" + type + ", salesmanname="
				+ salesmanname + ", make=" + make + ", model=" + model + ", price=" + price + ", status=" + status
				+ "]";
	}

	@Override
	public int compareTo(Vehicle o) {
		return this.vid-o.vid;
	}
	
	
	
	
	
	
}
