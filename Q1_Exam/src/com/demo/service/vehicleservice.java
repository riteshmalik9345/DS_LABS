package com.demo.service;

import com.demo.beans.Vehicle;

public interface vehicleservice {

	void addnewVehicle(int ch);

	Vehicle searchbymodel(String model);

	boolean book(int choice, double pri);

}
