package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Customer;
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
				message = "Customer registered successfully";
			}
			
		}
		catch(SQLException se)
		{
			se.getMessage();
		}
		
		
		
		
		
		
		
		
		
		
		return message;
		
	}
	
	
	

}
