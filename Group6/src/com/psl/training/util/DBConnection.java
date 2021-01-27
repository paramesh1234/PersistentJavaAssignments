package com.psl.training.util;

import java.sql.*;

public class DBConnection {
	static Connection cn=null;
	static String driverClass="oracle.jdbc.driver.OracleDriver";
	static String url="jdbc:oracle:thin:@localhost:1522:xe";
	static String username="c##paramesh3";
	static String password="c##paramesh3";
	public static Connection getConnection(){
		if(cn==null){
			// Optional
			try {
				Class.forName(driverClass);
				cn=DriverManager.getConnection(url,username,password);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
					}
		
		return cn;
		
	
	}
	
	public void closeConnection(){
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
