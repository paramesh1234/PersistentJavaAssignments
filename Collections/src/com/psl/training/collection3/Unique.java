package com.psl.training.collection3;

import java.util.*;

public class Unique {
	public static void main(String[] args) {
		String[] names= {"Paramesh","Jadddu","Parjbskajhdkjdfjh","paramesh","jsgdjfgsyudfusgfusufgug"};
		Set<Character> hs = new HashSet<>(); 
		HashMap<String, Integer> map=new HashMap<>();
		for (String s : names) {
			String str=s.toLowerCase();
			if(map.containsKey(str)==false) {
				hs = new HashSet<>(); 
				for (int i = 0; i < str.length(); i++) {
					hs.add(str.charAt(i));
				}
				map.put(str, hs.size());
			}
		}
		System.out.println(map);
	}
}
