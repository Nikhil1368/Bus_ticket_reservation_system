package com.masai.usercases;

import java.util.Scanner;

import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AdminException;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;

public class BookingConfirmationUserCase {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("To Confirm the Ticket Enter the username");
		String usernn = sc.next();
		
		System.out.println("Enter The Bus Number");
		String busnn = sc.next();
		
		
		AdminDao adm = new AdminDaoImpl();
		
		try {
			System.out.println(adm.TicketConfirmation(busnn, usernn));
		} catch (AdminException | BusException | CustomerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
