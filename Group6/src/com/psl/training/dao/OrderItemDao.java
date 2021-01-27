package com.psl.training.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.psl.training.beans.OrderItem;
import com.psl.training.util.DBConnection;

public class OrderItemDao {
	Connection cn=DBConnection.getConnection();
	public void insertOrderItem(OrderItem orderItem) {
		try {
			PreparedStatement pstmt = cn.prepareStatement("insert into orderitem values(?,?,?)");
			pstmt.setInt(1, orderItem.getPoNumber());
			pstmt.setInt(2, orderItem.getItemNumber());
			pstmt.setInt(3, orderItem.getNumberOfItems());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
