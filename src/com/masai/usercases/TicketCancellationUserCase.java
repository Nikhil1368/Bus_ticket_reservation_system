package com.masai.usercases;

import java.util.Scanner;


import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.exception.BusException;
import com.masai.exception.CustomerException;

public class TicketCancellationUserCase {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("To Delete the Ticket Enter the username");
		String usernn = sc.next();
		
		System.out.println("Enter The Bus Number");
		String busnn = sc.next();
		
		
		CustomerDao cdm = new CustomerDaoImpl();
		
		try {
			System.out.println(cdm.TicketCancellation(usernn, busnn));
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		} catch (BusException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
