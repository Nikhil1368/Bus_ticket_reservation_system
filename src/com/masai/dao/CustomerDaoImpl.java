package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.masai.bean.Customer;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;
import com.masai.utility.DbConnUtil;

public class CustomerDaoImpl implements CustomerDao {

	@Override
	public String registerCustomer(Customer customer) {
		
		
		String message = "Not Inserted";
		
		
		
		try(Connection conn = DbConnUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("insert into customer values (?,?,?,?,?)");
			
			ps.setString(1, customer.getUseranme());
			ps.setString(2, customer.getName());
			ps.setInt(3, customer.getAge());
			ps.setString(4, customer.getGender());
			ps.setString(5,customer.getPassword());
			
	
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message = "\n***************CUTOMER REGISTERED SUCCESSFULLY*******************";
			}
			
		}
		catch(SQLException se)
		{
<<<<<<< HEAD
			System.out.println("\n"+se.getMessage());
=======
			System.out.println(se.getMessage());
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		}
		return message;
		
	}

	
	
	@Override
	public Customer loginCustomer(String username, String password) throws CustomerException {
		Customer customer = null;
		
		try(Connection conn = DbConnUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from customer where username = ? AND password = ?");
			ps.setString(1, username);
			ps.setString(2, password);
			
			ResultSet rs = ps.executeQuery();
			
			if(rs.next())
			{
				String a =rs.getString("username");
				String b =rs.getString("name");
				int c =rs.getInt("age");
				String d =rs.getString("gender");
				String e =rs.getString("password");
				
				
				customer = new Customer(a, b, c, d, e);
			}
			else
			{
<<<<<<< HEAD
				throw new CustomerException("**************Customer Doesn't exist......First register yourself*************");
=======
				throw new CustomerException("Customer Doesn't exist......First register yourself");
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
			}
			
			
			
		} catch (Exception e) {
			throw new CustomerException(e.getMessage());
		}
		return customer;
	}



	@Override
	public String TicketCancellation(String username, String busNo) throws CustomerException, BusException {
String message = "************Not Deleted***********";
		
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
		    		PreparedStatement ps3 = conn.prepareStatement("delete from booking where bus_num = ? AND user = ?");
		    		
		    		ps3.setString(1, busNo);
		    		ps3.setString(2, username);
		    		
		    		int x =ps3.executeUpdate();
		    		
		    		if(x>0)
		    		{
<<<<<<< HEAD
		    			message = "\n************************"+x +" TICKET HAS BEEN CANCELLED***********************" ;
		    		}
		    		else
		    		{
		    			throw new CustomerException("\n**************Technical Error*************");
=======
		    			message = x +" ticket has been cancelled" ;
		    		}
		    		else
		    		{
		    			throw new CustomerException("technical error");
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		    		}
		    		
		    	
		    	}
		    	else
		    	{
<<<<<<< HEAD
		    		throw new BusException("\n*********Invalid Bus**********");
=======
		    		throw new BusException("*********Invalid Bus**********");
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		    	}
		    	
		    	
		    }
		    else
		    {
<<<<<<< HEAD
		    	throw new CustomerException("\n************Invalid Username***********");
=======
		    	throw new CustomerException("************Invalid Username***********");
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		    }
			
		
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return message;
	}
	
	
	

}
