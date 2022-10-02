package com.masai.dao;

import java.util.List;

import com.masai.bean.Bus;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;

public interface BusDao {
	
	public String insertBusDetails(Bus bus);
	
	public List<Bus> getBusByRoute(String stPoint,String endPoint) throws BusException;
	
	public String busBookingByCustomer(String busNumber,String username)throws BusException,CustomerException;
	
	public String seatsDeductionAfterBooking(String busNumber)throws BusException;
	

}
