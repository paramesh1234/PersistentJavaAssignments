package com.psl.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.psl.training.beans.Customer;
import com.psl.training.util.DBConnection;

public class CustomerDao {
	
	Connection cn=DBConnection.getConnection();
	
	public void insertCustomer(Customer customer) {
		try {
			PreparedStatement	pstmt = cn.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?)");
			pstmt.setInt(1, customer.getCustomerNumber());
			pstmt.setString(2, customer.getName());
			pstmt.setString(3, customer.getStreet());
			pstmt.setString(4, customer.getCity());
			pstmt.setString(5, customer.getState());
			pstmt.setString(6, customer.getZip());
			pstmt.setString(7, customer.getHomePhone());
			pstmt.setString(8, customer.getCellPhone());
			pstmt.setString(9, customer.getWorkPhone());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void printPhoneNumbers(int id) {
		try {
			Statement stmt = cn.createStatement();
			ResultSet rs=stmt.executeQuery("select homephone,cellphone,workphone from customer where customerNumber="+id);
			while(rs.next()) {
				System.out.println("Your phone numbers are: ");
				System.out.println("Home phone: "+rs.getString(1));
				System.out.println("Cell phone: "+rs.getString(2));
				System.out.println("Work phone: "+rs.getString(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getAllCustomers() {
		try {
			Statement stmt = cn.createStatement();
			ResultSet rs=stmt.executeQuery("select * from customer");
			while(rs.next()) {
				System.out.println("Customer ID: "+rs.getInt(1)+", Customer Name: "+rs.getString(2));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void getPurchaseOrders(int id) {
		Statement stmt;
		try {
			stmt = cn.createStatement();
			ResultSet rs=stmt.executeQuery("select c.customerNumber,c.name,c.street,c.city,c.zip,c.homephone,s.itemdescription,o.numberofitems,o.numberofitems*s.itemprice as price from customer c\r\n"
					+ "inner join purchaseorder p on\r\n"
					+ "c.customerNumber = p.customerNumber\r\n"
					+ "inner join orderitem o on\r\n"
					+ "p.ponumber = o.ponumber\r\n"
					+ "inner join stockitem s on\r\n"
					+ "s.itemnumber = o.itemnumber\r\n"
					+ "and c.customernumber="+id);
			System.out.println("Your orders are:");
			int i=1;
			while(rs.next()) {
				System.out.println("Order item "+i);
				System.out.println("Order: "+rs.getString(7)+", Quantity: "+rs.getString(8)+", Price: "+rs.getDouble(9));
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
