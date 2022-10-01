package com.masai.usercases;

import java.util.List;
import java.util.Scanner;

import com.masai.bean.Bus;
import com.masai.dao.BusDao;
import com.masai.dao.BusDaoImpl;
import com.masai.exception.BusException;

public class getBusByRouteUserCase {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Starting Point -->");
		String spoint = sc.nextLine();
		
		
		System.out.println("Enter the Ending point -->");
		String epoint = sc.nextLine();
		
		System.out.println("\n");
		
		
		
		BusDao bd = new BusDaoImpl();
		
		try {
			List<Bus> list = bd.getBusByRoute(spoint, epoint);
			System.out.println("*************These are the Buses for the desired Route**********");
			System.out.println("\n");
			list.forEach(l->System.out.println(l));
		} catch (BusException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}
	
	

}
