package com.psl.training.beans;

import java.sql.Date;

public class PurchaseOrder {
	private int poNumber;
	private Date orderDate,shipDate;
	private int customerNumber;
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	public PurchaseOrder() {
		// TODO Auto-generated constructor stub
	}
	public PurchaseOrder(int poNumber, Date orderDate, Date shipDate,int customerNumber) {
		super();
		this.poNumber = poNumber;
		this.orderDate = orderDate;
		this.shipDate = shipDate;
		this.customerNumber=customerNumber;
	}
	public int getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public Date getShipDate() {
		return shipDate;
	}
	public void setShipDate(Date shipDate) {
		this.shipDate = shipDate;
	}
}
