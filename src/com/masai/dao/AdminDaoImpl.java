package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Admin;
import com.masai.bean.Ticket;
import com.masai.exception.AdminException;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;
import com.masai.utility.DbConnUtil;

public class AdminDaoImpl implements AdminDao  {

	@Override
	public Admin loginAdmin(String username, String password) throws AdminException {
		
        Admin admin =  null;
		
		try(Connection conn = DbConnUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from administrator where username = ? AND password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				String a =rs.getString("username");
				String b =rs.getString("name");
				String e =rs.getString("password");
				
				
				admin = new Admin(a, b, e);
			}
			else
			{
				throw new AdminException("\n**************Not the Admin...Please fill right credentials*************");
			}
			
			
			
		} catch (Exception e) {
			throw new AdminException(e.getMessage());
		}
		return admin;
		
	}

	@Override
	public List<Ticket> getTicketOfCustomer(String name) throws BusException {
		
		List<Ticket> list = new ArrayList<>();
		
		try (Connection conn = DbConnUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select b.bus_number,b.st_point,b.end_point,c.name,c.age,c.gender from customer c INNER JOIN bus b INNER JOIN booking bg ON c.username = bg.user AND b.bus_number = bg.bus_num AND c.name = ?;");
			
			ps.setString(1, name);
			
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next())
			{
				String a = rs.getString("b.bus_number");
				String b = rs.getString("b.st_point");
				String c = rs.getString("b.end_point");
				String d = rs.getString("c.name");
				int e = rs.getInt("c.age");
				String f = rs.getString("c.gender");
				
				Ticket tc = new Ticket(a, b, c, d, e, f);
				
				list.add(tc);			
			}
			
			if(list.isEmpty())
			{
				throw new BusException("\n***************NO TICKETS BOOKED BY THE CUSTOMER************************");
			}
			
			
			
		} catch (SQLException e) {
			
			throw new BusException(e.getMessage());
			
		}
		return list;
		
	}

	@Override
	public String TicketConfirmation(String busNo, String username) throws AdminException, BusException,CustomerException {
		
		String message = "*******No Details Inserted********";
		
		try(Connection conn = DbConnUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from customer where username =?");
			ps.setString(1, username);
			
			
		    ResultSet rs = ps.executeQuery();
		    
		    if(rs.next())
		    {
		    	PreparedStatement ps2 = conn.prepareStatement("select * from bus where bus_number = ?");
		    	ps2.setString(1, busNo);
		    	
		    	ResultSet rs2 = ps2.executeQuery();
		    	
		    	if(rs2.next())
		    	{
		    		PreparedStatement ps3 = conn.prepareStatement("update booking set confirmation = true where bus_num = ? AND user = ?");
		    		ps3.setString(1, busNo);
		    		ps3.setString(2, username);
		    		
		    		int x = ps3.executeUpdate();
		    		
		    		if(x>0)
		    		{
		    			message = "\n*********************TICKET HAS BEEN CONFIRMED FOR : "+username+" ***************************************";
		    		}
		    		else
		    		{
		    			throw new AdminException("\n*********Technical Error**************");
		    		}
		    		
		    		
		    	}
		    	else
		    	{
		    		throw new BusException("\n*************INVALID BUS******************");
		    	}
		    	
		    	
		    }
		    else
		    {
		    	throw new CustomerException("\n*********INVALID USERNAME**************");
		    }
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw new AdminException(e.getMessage());
		}
		
		
		
		
		
		return message;
		
	}
	
	
	

}
