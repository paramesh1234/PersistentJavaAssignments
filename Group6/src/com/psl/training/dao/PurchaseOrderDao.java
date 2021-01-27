package com.psl.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.psl.training.beans.PurchaseOrder;
import com.psl.training.util.DBConnection;

public class PurchaseOrderDao {
	Connection cn=DBConnection.getConnection();
	
	public void insertPurchaseOrder(PurchaseOrder purchaseOrder) {
		try {
			PreparedStatement	pstmt = cn.prepareStatement("insert into purchaseorder values(?,?,?,?)");
			pstmt.setInt(1, purchaseOrder.getPoNumber());
			pstmt.setDate(2, purchaseOrder.getOrderDate());
			pstmt.setDate(3, purchaseOrder.getShipDate());
			pstmt.setInt(4, purchaseOrder.getCustomerNumber());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
