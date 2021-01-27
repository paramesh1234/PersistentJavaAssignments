package com.psl.training.collection4;

import java.util.Comparator;

public class SortByDate implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getJoinedDate().compareTo(o2.getJoinedDate());
	}

}
