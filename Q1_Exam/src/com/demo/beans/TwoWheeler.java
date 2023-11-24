package com.demo.beans;

import java.time.LocalDate;

public class TwoWheeler extends Vehicle{
	private double dickycapacity;

	

	public TwoWheeler() {
		super();
	}



	public TwoWheeler(int id, String ownername, LocalDate datemf, String type, String salesmannm, String model,
			double price, String status,double dickycapacity) {
		super(id,ownername,datemf,type,salesmannm,model,
				price,status);
		this.dickycapacity = dickycapacity;
	}



	public double getDickycapacity() {
		return dickycapacity;
	}



	public void setDickycapacity(double dickycapacity) {
		this.dickycapacity = dickycapacity;
	}



	@Override
	public String toString() {
		return super.toString()+"TwoWheeler [dickycapacity=" + dickycapacity + "]";
	}
	
	
}
