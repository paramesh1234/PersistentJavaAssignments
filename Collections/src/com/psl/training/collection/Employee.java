package com.psl.training.collection;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
    private final List vehicles = new ArrayList<>();
    
    Employee(String name){
    	this.setName(name);
    }
    
    public void addVehicle(String vehicle) {
    	this.vehicles.add(vehicle);
    }
    
    public List getVehicle() {
    	return vehicles;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
