package com.psl.training.collection4;

import java.sql.Date;
import java.util.*;
import java.time.LocalDate;
import java.time.*;
import java.time.temporal.ChronoUnit;
public class Tester {

	public static void main(String[] args) {
		Employee e1=new Employee("Paramesh",101,Date.valueOf("2020-05-15"),Date.valueOf("2020-05-13"));
		Employee e2=new Employee("Niranjan",102,Date.valueOf("2020-05-16"),Date.valueOf("2020-05-17"));
		Employee e3=new Employee("Praani",103,Date.valueOf("2021-01-01"),Date.valueOf("2021-01-12"));
		Employee e4=new Employee("Chinni",104,Date.valueOf("2020-05-15"),Date.valueOf("2020-05-12"));
		Set<Employee> employees = new TreeSet<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		displayAllInformation(employees);
		allEmployeesWhoHaveJoinedOrganizationBeforeEnteredDate(employees);
		getMonths(employees);
		sortByJoinedDate(employees);
	}

	private static void sortByJoinedDate(Set<Employee> employees) {
		Set<Employee> e = new TreeSet<>(new SortByDate());
		e.addAll(employees);
		System.out.println("Sort by date: ");
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

	private static void getMonths(Set<Employee> employees) {
		System.out.println("Months of 6: ");
		for (Employee employee : employees) {
			Period diff = Period.between(LocalDate.parse(employee.getJoinedDate().toString()), LocalDate.now()); 
			if(diff.getMonths()>=6)
			System.out.println(employee.getName());
		}
		
	}

	private static void allEmployeesWhoHaveJoinedOrganizationBeforeEnteredDate(Set<Employee> employees) {
		System.out.println("Joined and entered: ");
		for (Employee employee : employees) {
			//System.out.println(ChronoUnit.DAYS.between(LocalDate.parse(employee.getEnteredDate().toString()),LocalDate.parse(employee.getJoinedDate().toString())));
			if(ChronoUnit.DAYS.between(LocalDate.parse(employee.getJoinedDate().toString()),LocalDate.parse(employee.getEnteredDate().toString()))>1)
				System.out.println(employee.getName());
		}
	}

	private static void displayAllInformation(Set<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee.toString());
		}
	}

}
