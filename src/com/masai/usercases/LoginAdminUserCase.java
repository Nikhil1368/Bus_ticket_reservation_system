package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AdminException;

public class LoginAdminUserCase {
	
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Admin username -->");
		String un = sc.next();
		
		System.out.println("Enter the Admin password -->");
		String pass = sc.next();
		
		System.out.println("\n");
		
		
		AdminDao ad = new AdminDaoImpl();
		
		
		try {
			Admin admin = ad.loginAdmin(un, pass);
			
			System.out.println("***************Welcome to the portal : "+admin.getName()+"******************");
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		
	}

}
