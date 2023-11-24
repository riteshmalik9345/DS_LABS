package com.demo.beans;

import java.time.LocalDate;

public class TwoWheeler extends Vehicle {
	private int dicky_cap;
	
	public TwoWheeler(int vid, String owner, LocalDate dom, String type, String salesmanname, String make, String model,
			int price, String status,int dicky_cap) {
		super(vid, owner, dom, type, salesmanname, make, model, price, status);
		this.dicky_cap=dicky_cap;
		
	}

	public int getDicky_cap() {
		return dicky_cap;
	}

	public void setDicky_cap(int dicky_cap) {
		this.dicky_cap = dicky_cap;
	}

	@Override
	public String toString() {
		return super.toString()+" TwoWheeler [dicky_cap=" + dicky_cap + "]";
	}
	
	

	
	
	
}
