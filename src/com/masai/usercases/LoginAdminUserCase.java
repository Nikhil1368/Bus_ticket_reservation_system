package com.masai.usercases;

import java.util.Scanner;

import com.masai.bean.Admin;
import com.masai.dao.AdminDao;
import com.masai.dao.AdminDaoImpl;
import com.masai.exception.AdminException;

public class LoginAdminUserCase {
	
<<<<<<< HEAD
	public static boolean main(String[] args) {
		
		boolean b = false;
=======
	public static void main(String[] args) {
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		
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
<<<<<<< HEAD
			
			b = true;
			
=======
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		} catch (AdminException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
<<<<<<< HEAD
		return b;
=======
		
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
	}

}
