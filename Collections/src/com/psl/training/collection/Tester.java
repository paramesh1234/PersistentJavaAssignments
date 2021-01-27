package com.psl.training.collection;

public class Tester {
	public static void main(String[] args) {
		Employee e=new Employee("Paramesh");
		e.addVehicle("TVS");
		e.addVehicle("Ducati");
		Employee e1=new Employee("Pranita");
		e1.addVehicle(" BMW");
		e1.addVehicle("Benz");
		System.out.println(e.getName()+" vahicles are: ");
		for (Object obj : e.getVehicle()) {
			System.out.println(obj);
		}
		System.out.println(e1.getName()+" vahicles are: ");
		for (Object obj : e1.getVehicle()) {
			System.out.println(obj);
		}
	}
}
