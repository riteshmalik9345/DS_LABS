package com.demo.dao;

import com.demo.beans.Vehicle;

public interface Vehicledao {

	void save(Vehicle v);

	Vehicle searchbymodel(String model);

	boolean book(int choice, double pri);

}
