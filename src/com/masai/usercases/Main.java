package com.masai.usercases;

import java.util.Scanner;

public class Main {
	
	static boolean flag = true;
	static boolean flag1 = true;
	static boolean flag2 = true;
	
	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
<<<<<<< HEAD
		System.out.println("\n");
		
		System.out.println("<<<<<<<<<<<<<<<<<<********************************** WELCOME TO THE BUS TICKET RESERVATION PORTAL **********************************>>>>>>>>>>>>>>>>>>>");
=======
		System.out.println("<<<<<*********Welcome to the Bus Ticket Reservation Portal******>>>>>");
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
		
		System.out.println("\n");
		while(flag)
		{
		System.out.println("\n");
		
		System.out.println("--------------------Please Select an option to Continue---------------");
		System.out.println("\n");
		System.out.println("1.Login as Customer");
		System.out.println("2.Login as Administrator");
		System.out.println("3.New Customer ?? Signin");
		System.out.println("4.Exit from the portal");
		System.out.println("\n");
		
		System.out.println("Enter your Choice-->");
		
		int choice = sc.nextInt();

		switch(choice)
		{
		case 1 :	
			
<<<<<<< HEAD
			boolean b = LoginCustomerUserCase.main(args);
			
			if(b == true)
			{
				while(flag1)
				{
				System.out.println("\n");
				System.out.println("1.Book a ticket by Starting and end point...");
				System.out.println("2.Cancelling a ticket");
				System.out.println("3.Return To The Main Portal");
				
				System.out.println("\n");
				
				System.out.println("Enter your choice -->");
				
				int choice2 = sc.nextInt();
					switch(choice2)
					{
					case 1:
						boolean d = getBusByRouteUserCase.main(args);
						if(d == true)
						{
							System.out.println("\n");
							BusBookingUserCase.main(args);
						}
						else
						{
							main(args);
						}
					break;
					case 2:
						TicketCancellationUserCase.main(args);
					break;
					case 3:
						flag1 = false;
					break;
					default:
						System.out.println("***********Enter the Right Choice********");
					break;
					}
			     }
			}
			else
			{
				main(args);
			}
			
			
=======
			LoginCustomerUserCase.main(args);
			
			while(flag1)
			{
			System.out.println("\n");
			System.out.println("1.Book a ticket by Starting and end point...");
			System.out.println("2.Cancelling a ticket");
			System.out.println("3.Return To The Main Portal");
			
			System.out.println("\n");
			
			System.out.println("Enter your choice -->");
			
			int choice2 = sc.nextInt();
				switch(choice2)
				{
				case 1:
					getBusByRouteUserCase.main(args);
					System.out.println("\n");
					BusBookingUserCase.main(args);
				break;
				case 2:
					TicketCancellationUserCase.main(args);
				break;
				case 3:
					flag1 = false;
				break;
				default:
					System.out.println("***********Enter the Right Choice********");
				break;
				}
		     }
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
				
        break;
        
			    
		case 2 :
			
<<<<<<< HEAD
			Boolean c = LoginAdminUserCase.main(args);
			
			if(c == true)
			{
				while(flag2)
				{
				System.out.println("\n");
				System.out.println("1.Add new Bus Details...");
				System.out.println("2.Confirm a Ticket...");
				System.out.println("3.Get details the confirmed Ticket of A Customer...");
				System.out.println("4.Return To The Main Portal...");
				System.out.println("\n");
				
				System.out.println("Enter Your Choice -->");
				
				int choice3 = sc.nextInt();
				
				switch(choice3)
				{
				case 1:
					InsertBusDetalisUserCase.main(args);
				break;
				case 2 :
					BookingConfirmationUserCase.main(args);
				break;
				case 3 : 
					getTicketByCustomerUserCase.main(args);
				break;
				case 4 :
					flag2 = false;
				break;
				default :
					System.out.println("***********Enter the Right Choice********");
				break;
				}
			    }
				
			}
			else
			{
				main(args);
			}
			
			
			
=======
			LoginAdminUserCase.main(args);
			
			System.out.println("\n");
			
			while(flag2)
			{
			System.out.println("\n");
			System.out.println("1.Add new Bus Details...");
			System.out.println("2.Confirm a Ticket...");
			System.out.println("3.Get details the confirmed Ticket of A Customer...");
			System.out.println("4.Return To The Main Portal...");
			System.out.println("\n");
			
			System.out.println("Enter Your Choice -->");
			
			int choice3 = sc.nextInt();
			
			switch(choice3)
			{
			case 1:
				InsertBusDetalisUserCase.main(args);
			break;
			case 2 :
				BookingConfirmationUserCase.main(args);
			break;
			case 3 : 
				getTicketByCustomerUserCase.main(args);
			break;
			case 4 :
				flag2 = false;
			break;
			default :
				System.out.println("***********Enter the Right Choice********");
			break;
			}
		    }
>>>>>>> 036c0ec98ad99666f4aae4a06760c459913c4ca1
			
		break;
				
		case 3 :
		
			sc.nextLine();
			registerCustomerUserCase.main(args);
			break;
			
		case 4 :
			System.out.println("Thank You!!!! for visiting the portal...");
			flag = false;
			break;
			
		default :
			System.out.println("***********Enter the Right Choice********");
			break;	
		}
		
	}
	}

}
