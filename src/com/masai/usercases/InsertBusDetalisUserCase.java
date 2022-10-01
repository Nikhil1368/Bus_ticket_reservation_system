package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Bus;
import com.masai.dao.BusDao;
import com.masai.dao.BusDaoImpl;

public class InsertBusDetalisUserCase {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Bus Number -->");
		String busNum = sc.next();
		
		System.out.println("Enter the Bus Name -->");
		String name = sc.next();
		
		System.out.println("Enter the seats in bus -->");
		int seats = sc.nextInt();
		
		System.out.println("Enter the departure time (hh:mm:ss) -->");
		String deptime = sc.next();
		
		System.out.println("Enter the arrival time (hh:mm:ss) -->");
		String arrtime = sc.next();
		
		System.out.println("Enter the Starting Point -->");
		String stPoint = sc.next();
		
		System.out.println("Enter the Ending Point -->");
		String endPoint = sc.next();
		
		
		Bus bus = new Bus(busNum, name, seats, deptime, arrtime, stPoint, endPoint);
		
		BusDao bd = new BusDaoImpl();
		
		System.out.println(bd.insertBusDetails(bus));
		
		
	}

}
