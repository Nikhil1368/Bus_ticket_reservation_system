package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Customer;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;
import com.masai.exception.CustomerException;

public class LoginCustomerUserCase {
	
	
<<<<<<< HEAD
	public static boolean main(String[] args) {
		
		boolean b = false;
=======
	public static void main(String[] args) {
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the username -->");
		String un = sc.next();
		
		System.out.println("Enter the password -->");
		String pass = sc.next();
		
		System.out.println("\n");
		
		
	    CustomerDao cd = new CustomerDaoImpl();
	    try {
			Customer customer = cd.loginCustomer(un, pass);
			 
			System.out.println("************** Welcome to the portal : "+customer.getName() + " *******************");
			
<<<<<<< HEAD
			b = true;
=======
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
			
		} catch (CustomerException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
<<<<<<< HEAD
	    
	    return b;
=======
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		
	}

}
