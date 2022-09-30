package com.masai.dao;

import com.masai.bean.Bus;

public interface BusDao {
	
	public String insertBusDetails(Bus bus);
	
	public Bus getBusByRoute(String stPoint,String endPoint);

}
