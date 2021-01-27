package com.psl.training.e3;

import java.io.*;
import java.util.*;

public class Movies {

	public static void main(String[] args) {
		try {
		      File myObj = new File("C:\\Users\\param\\OneDrive\\Desktop\\movies.txt");
		      HashMap<Integer, String> m = new HashMap<Integer, String>();
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String[] data = myReader.nextLine().split("-");
		        try {
		        	m.put(Integer.parseInt(data[0].trim()), data[1]);
		        }
		        catch(NumberFormatException e) {
		        	
		        }
		      }
		      myReader.close();
		      System.out.println(m);
		    } catch (FileNotFoundException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}

}
