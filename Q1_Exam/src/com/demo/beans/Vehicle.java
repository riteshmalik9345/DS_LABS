package com.demo.beans;

import java.time.LocalDate;

public class Vehicle implements Comparable<Vehicle>{
	private int id;
	private String ownername;
	private LocalDate datemf;
	private String type;
	private String salesmannm;
	private String model;
	private double price;
	private String status;
	public Vehicle() {
		super();
	}
	public Vehicle(int id, String ownername, LocalDate datemf, String type, String salesmannm, String model,
			double price, String status) {
		super();
		this.id = id;
		this.ownername = ownername;
		this.datemf = datemf;
		this.type = type;
		this.salesmannm = salesmannm;
		this.model = model;
		this.price = price;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getOwnername() {
		return ownername;
	}
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	public LocalDate getDatemf() {
		return datemf;
	}
	public void setDatemf(LocalDate datemf) {
		this.datemf = datemf;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSalesmannm() {
		return salesmannm;
	}
	public void setSalesmannm(String salesmannm) {
		this.salesmannm = salesmannm;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
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
		return "Vehicle [id=" + id + ", ownername=" + ownername + ", datemf=" + datemf + ", type=" + type
				+ ", salesmannm=" + salesmannm + ", model=" + model + ", price=" + price + ", status=" + status + "]";
	}
	@Override
	public int compareTo(Vehicle o) {
		// TODO Auto-generated method stub
		return this.id=o.id;
	}
	@Override
	public boolean equals(Object o) {
		return this.id==((Vehicle)o).id;
	}
	
	@Override
	public int hashCode() {
		return id;
	}
	

}
