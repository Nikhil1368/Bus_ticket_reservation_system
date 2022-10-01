package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Customer;
import com.masai.dao.CustomerDao;
import com.masai.dao.CustomerDaoImpl;

public class registerCustomerUserCase {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Username -->");
		String username = sc.nextLine();
		
		System.out.println("Enter your Name -->");
		String name = sc.nextLine();
		
		System.out.println("Enter your age -->");
		int age = sc.nextInt();
		
		System.out.println("Enter your gender -->");
		String gender = sc.next();
		
		System.out.println("Enter Your password -->");
		String password = sc.next();
		
		
		
		Customer customer = new Customer(username, name, age, gender, password);
		
		CustomerDao cd = new CustomerDaoImpl();
		
		System.out.println(cd.registerCustomer(customer));
		
		
		
		
		
	}

}
