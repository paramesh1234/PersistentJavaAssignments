package com.psl.training.beans;


public class OrderItem {
	private int poNumber,itemNumber,numberOfItems;
	public OrderItem(int poNumber, int itemNumber, int numberOfItems) {
		super();
		this.poNumber = poNumber;
		this.itemNumber = itemNumber;
		this.numberOfItems = numberOfItems;
	}
	public OrderItem() {
		
	}
	public int getPoNumber() {
		return poNumber;
	}
	public void setPoNumber(int poNumber) {
		this.poNumber = poNumber;
	}
	public int getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}
	public int getNumberOfItems() {
		return numberOfItems;
	}
	public void setNumberOfItems(int numberOfItems) {
		this.numberOfItems = numberOfItems;
	}
	
}
