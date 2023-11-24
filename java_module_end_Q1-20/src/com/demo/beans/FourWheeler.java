package com.demo.beans;

import java.time.LocalDate;

public class FourWheeler extends Vehicle{
	private String engine_type,gear_type;

	public FourWheeler(int vid, String owner, LocalDate dom, String type, String salesmanname, String make, String model,
			int price, String status,String engine_type, String gear_type) {
		super(vid,owner,dom,type,salesmanname,make,model,price,status);
		this.engine_type = engine_type;
		this.gear_type = gear_type;
	}

	public String getEngine_type() {
		return engine_type;
	}

	public void setEngine_type(String engine_type) {
		this.engine_type = engine_type;
	}

	public String getGear_type() {
		return gear_type;
	}

	public void setGear_type(String gear_type) {
		this.gear_type = gear_type;
	}

	@Override
	public String toString() {
		return super.toString()+" FourWheeler [engine_type=" + engine_type + ", gear_type=" + gear_type + "]";
	}
	
	
	
	
}


