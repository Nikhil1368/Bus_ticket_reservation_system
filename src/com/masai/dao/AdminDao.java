package com.masai.dao;

import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Ticket;
import com.masai.exception.AdminException;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;

public interface AdminDao {
	
	public Admin loginAdmin(String username,String password)throws AdminException;
	
    public List<Ticket> getTicketOfCustomer(String name) throws BusException;
    
    public String TicketConfirmation(String busNo,String username)throws AdminException,BusException,CustomerException;
    
    
    

}
