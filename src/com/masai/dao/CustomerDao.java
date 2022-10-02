package com.masai.dao;

import com.masai.bean.Customer;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;

public interface CustomerDao {
	
	
	public String registerCustomer(Customer customer);
	
	public Customer loginCustomer(String username,String password)throws CustomerException;
	
	public String TicketCancellation(String username,String busNo)throws CustomerException,BusException;

}
