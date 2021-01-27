package com.psl.training.collection1;

import java.util.Comparator;

class Sort implements Comparator<Movies>{

	@Override
	public int compare(Movies o1, Movies o2) {
		if(o1.getLanguage().compareTo(o2.getLanguage())==0) {
			return o1.getReleaseDate().compareTo(o2.getReleaseDate());
		}
		return o1.getLanguage().compareTo(o2.getLanguage());
	}
	
}