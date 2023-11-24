package com.demo.beans;

import java.time.LocalDate;

public class FourWheeler extends Vehicle{
	private String engin_type;
	private String gear_type;
	public FourWheeler() {
		super();
	}
	public FourWheeler(int id, String ownername, LocalDate datemf, String type, String salesmannm, String model,
			double price, String status,String engin_type, String gear_type) {
		super(id,ownername,datemf,type,salesmannm,model,price,status);
		this.engin_type = engin_type;
		this.gear_type = gear_type;
	}
	public String getEngin_type() {
		return engin_type;
	}
	public void setEngin_type(String engin_type) {
		this.engin_type = engin_type;
	}
	public String getGear_type() {
		return gear_type;
	}
	public void setGear_type(String gear_type) {
		this.gear_type = gear_type;
	}
	@Override
	public String toString() {
		return super.toString()+"FourWheeler [engin_type=" + engin_type + ", gear_type=" + gear_type + "]";
	}
	

}
