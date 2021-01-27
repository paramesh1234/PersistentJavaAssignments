package com.psl.training.collection1;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Tester {

	public static void main(String[] args) {
		//List<Movies> m=initList(); 
		Movies m1 =initList();
		List<Movies> list=m1.getM();
		Collections.sort(list);
		System.out.println("Printing language wise using comparable: ");
		for (Movies string : list) {
			System.out.println(string.getName());
		}
		System.out.println("Printing language wise using comparator: ");
		Set<Movies> sortByLanguage=new TreeSet<>(new SortByLanguage());
		sortByLanguage.addAll(list);
		for (Movies movies : sortByLanguage) {
			System.out.println(movies.getName());
		}
		System.out.println("Printing duration wise using comparator: ");
		Set<Movies> sortByDuration=new TreeSet<>(new SortByDuration());
		sortByDuration.addAll(list);
		for (Movies movies : sortByDuration) {
			System.out.println(movies.getName());
		}
		System.out.println("Printing date wise  using comparator: ");
		Set<Movies> sortByDate=new TreeSet<>(new Sort());
		sortByDate.addAll(list);
		for (Movies movies : sortByDate) {
			System.out.println(movies.getName());
		}
	}

	public static Movies initList() {
		List<Movies> m =new ArrayList<>();
		m.add(new Movies("Harry", "English", Date.valueOf("2008-10-12"), "John", "Kenneddy", 1));
		m.add(new Movies("Abraham", "English", Date.valueOf("1998-12-31"), "John", "Kenneddy", 5));
		m.add(new Movies("kaju", "Hindi", Date.valueOf("2018-01-28"), "John", "Kenneddy", 3));
		Movies m1 =new Movies();
		m1.setM(m);
		return m1;
	}
}

