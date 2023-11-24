package com.demo.dao;

import java.util.Set;
import java.util.TreeSet;

import com.demo.beans.TwoWheeler;
import com.demo.beans.Vehicle;
import com.demo.beans.FourWheeler;

public class Vehicledaoimpl implements Vehicledao {

	static TreeSet<Vehicle> ts;
	static {
		ts=new TreeSet<>();
	}


	@Override
	public void save(Vehicle v) {
		ts.add(v);
	}


	@Override
	public Vehicle searchbymodel(String model) {
		for(Vehicle v:ts) {
			if(v.getModel().equals(model)) {
				return v;
			}
		}
		return null;
	}


	@Override
	public boolean book(int choice, double pri) {
		if(choice==1) {
			for(Vehicle v:ts) {
				if(v instanceof TwoWheeler) {
					if(pri>v.getPrice()) {
						return true;
					}
				}
			}
		}
			
		else if(choice==2) {
				for(Vehicle v:ts) {
					if(v instanceof FourWheeler) {
						if(pri>v.getPrice()) {
							return true;
						}
					}
		}
				
		

}	return false;
	}}
