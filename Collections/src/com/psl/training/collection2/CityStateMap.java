package com.psl.training.collection2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class CityStateMap {
	public static void main(String[] args) {
		String fileName="C:\\Users\\param\\OneDrive\\Desktop\\states.txt";
		HashMap<String, String> map=getData(fileName);
		getCities(map);
		getStates(map);
		getCityForState("AP",map);
		addNewCityAndStatePair(fileName,map,"Kerala","Tirvanatapuram");
		deleteCityForGivenState("Karnataka",map);
	}

	private static void deleteCityForGivenState(String string, HashMap<String, String> map) {
		map.remove(string);
		map.put(string, null);
		System.out.println(map);
	}

	private static void addNewCityAndStatePair(String fileName, HashMap<String, String> map, String string, String string2) {
		File log = new File(fileName);
			    try{
			    PrintWriter out = new PrintWriter(new FileWriter(log, true));
			    out.append("\n");
			    out.append(string+" - "+string2);
			    out.close();
			    }catch(IOException e){
			        System.out.println("COULD NOT LOG!!");
			    }
	}

	private static void getCityForState(String string,HashMap<String, String> map) {
		System.out.println(map.get(string));
	}

	private static void getStates(HashMap<String, String> map) {
		System.out.println(map.keySet());
		
	}

	private static void getCities(HashMap<String, String> map) {
		System.out.println(map.values());
	}

	private static HashMap<String, String> getData(String fileName) {
		HashMap<String, String> map=new HashMap<>();
		 try {
		      File myObj = new File(fileName);
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String data = myReader.nextLine();
		        String[] d=data.split("-");
		        map.put(d[0].trim(), d[1].trim());
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		return map;
	}
}
