package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.masai.bean.Bus;
import com.masai.utility.DbConnUtil;

public class BusDaoImpl implements BusDao {

	@Override
	public String insertBusDetails(Bus bus) {
		
		String message = "Not Inserted";
		
		
		try(Connection conn = DbConnUtil.provideConnection()) {
			
			
			PreparedStatement ps = conn.prepareStatement("insert into bus values (?,?,?,?,?,?,?)");
			
			ps.setString(1, bus.getBusNumber());
			ps.setString(2,bus.getBusName());
			ps.setInt(3,bus.getSeats());
			ps.setString(4,bus.getDepTime());
			ps.setString(5, bus.getArrTime());
			ps.setString(6,bus.getStPoint());
			ps.setString(7, bus.getEndPoint());
			
			
			int  x =ps.executeUpdate();
			
			if(x>0)
			{
				message = "Bus details Inserted Successfully";
			}
			
			
			
			
			
		} catch (SQLException e) {
			e.getMessage();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		return message;
		
		
		
		
		
	}

}
