package com.masai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.masai.bean.Bus;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;
import com.masai.utility.DbConnUtil;
import com.mysql.cj.protocol.Resultset;

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
			System.out.println(e.getMessage());
		}
		
		return message;
		
	}

	@Override
	public List<Bus> getBusByRoute(String stPoint, String endPoint)throws BusException {
		
		List<Bus> buses = new ArrayList<>();
		
		
		try (Connection conn = DbConnUtil.provideConnection()){
			
			PreparedStatement ps = conn.prepareStatement("select * from bus where st_point = ?  AND end_point = ?");
			ps.setString(1, stPoint);
			ps.setString(2, endPoint);
			
			
			ResultSet rs =ps.executeQuery();
			
			
			while(rs.next())
			{
				String a = rs.getString("bus_number");
				String b = rs.getString("bus_name");
				int c  = rs.getInt("seats");
				String d = rs.getString("departure_time");
				String e = rs.getString("arrival_time");
				String f = rs.getString("st_point");
				String g = rs.getString("end_point");	
				
				Bus bus = new Bus(a, b, c, d, e,f,g);
				
				buses.add(bus);
				
				
			}	
		} catch (SQLException e) {
			// TODO: handle exception
			throw new BusException(e.getMessage());
		}
		
		if(buses.size() == 0)
		{
			throw new BusException("**************No Buses found for that route****************");
		}

		return buses;	
	}
	
	

	@Override
	public String busBookingByCustomer(String busNumber, String username) throws BusException, CustomerException {
		String message = "Not Booked";
		
		try(Connection conn = DbConnUtil.provideConnection()) {
			
			PreparedStatement ps = conn.prepareStatement("select * from customer where username =?");
			ps.setString(1, username);
			
			
		    ResultSet rs = ps.executeQuery();
		    
		    if(rs.next())
		    {
		    	PreparedStatement ps2 = conn.prepareStatement("select * from bus where bus_number = ?");
		    	ps2.setString(1, busNumber);
		    	
		    	ResultSet rs2 = ps2.executeQuery();
		    	
		    	if(rs2.next())
		    	{
		    		PreparedStatement ps3 = conn.prepareStatement("insert into booking values (?,?,?)");
		    		
		    		ps3.setString(1, busNumber);
		    		ps3.setString(2, username);
		    		ps3.setBoolean(3, false);
		    		
		    		int x =ps3.executeUpdate();
		    		
		    		if(x>0)
		    		{
		    			message = this.seatsDeductionAfterBooking(busNumber);
		    		}
		    		else
		    		{
		    			throw new CustomerException("**********technical error***********");
		    		}
		    		
		    	
		    	}
		    	else
		    	{
		    		throw new BusException("************Invalid Bus****************");
		    	}
		    	
		    	
		    }
		    else
		    {
		    	throw new CustomerException("*****************Invalid Username***************");
		    }
			
		
		} catch (SQLException e) {
			// TODO: handle exception
			throw new CustomerException(e.getMessage());
		}
		return message;
		
	}

	@Override
	public String seatsDeductionAfterBooking(String busNumber) throws BusException {
		String message = "Please Enter The Correct details";
		
		
		try(Connection conn = DbConnUtil.provideConnection()) {
			
			PreparedStatement ps =  conn.prepareStatement("update bus set seats = seats-1 where bus_number = ? AND seats > 0");
			ps.setString(1, busNumber);
			
			int x = ps.executeUpdate();
			
			if(x>0)
			{
				message = "**********Hurray....!!!!!!! Booking Done Successfully**********\n*******You will Recieve A Text after Confirmation of Ticket*************";
			}
			else
			{
				throw new BusException("*********NO SEATS AVAILABLE TO BOOK **********");
			}	
			
		} catch (SQLException e) {
			throw new BusException(e.getMessage());
		}
		
		
		
		
		return message;
	}

}
