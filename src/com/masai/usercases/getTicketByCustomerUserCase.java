package com.masai.usercases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Ticket;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.BusException;



public class getTicketByCustomerUserCase {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<-----------Enter the Customer Name to fetch the Booked Tickets------------->");
		String name = sc.nextLine();
		
		System.out.println("\n");
		
		
		AdminDao amd = new AdminDaoImpl();
		 
		try {
			List<Ticket> list = amd.getTicketOfCustomer(name);
			
			System.out.println("*******************Here Are The Tickets********************");
			
			list.forEach(l -> System.out.println(l));
			
			
		} catch (BusException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
