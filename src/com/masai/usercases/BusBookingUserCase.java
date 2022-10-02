package com.masai.usercases;

import java.util.Scanner;

import com.masai.dao.BusDao;
import com.masai.dao.BusDaoImpl;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;

public class BusBookingUserCase {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Confirm Your Username to book-->");
		String un = sc.nextLine();
		
		System.out.println("Enter the BusNumber From Above Buses-->");
		String bn = sc.nextLine();
		
		BusDao bd = new BusDaoImpl();
		
		try {
			System.out.println("\n");
			System.out.println(bd.busBookingByCustomer(bn, un));
		} catch (BusException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
