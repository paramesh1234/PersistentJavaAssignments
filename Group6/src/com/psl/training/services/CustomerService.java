package com.psl.training.services;
import com.psl.training.dao.CustomerDao;

public class CustomerService {
	CustomerDao customerDao=new CustomerDao();
	
	public void getAllCustomers() {
		customerDao.getAllCustomers();
	}
}
