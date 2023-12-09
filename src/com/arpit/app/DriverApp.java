package com.arpit.app;

import java.util.Scanner;

import com.arpit.model.Employee;
import com.arpit.service.EmployeeServiceImpl;

public class DriverApp {

	public static void main(String[] args) {
		EmployeeServiceImpl empImpl=new EmployeeServiceImpl();
		Scanner sc=new Scanner(System.in);

	

		System.out.println("Please enter Your First Name");

		String firstName=sc.next();

		System.out.println("Please enter Your Last Name");

		String lastName=sc.next();

		System.out.println("1. Technicle");

		System.out.println("2. Admin");

		System.out.println("3. Human Resource");

		System.out.println("4. Legal");

		System.out.println("Please choose Dept");

		int choice=sc.nextInt();
		
		String genEmail="";
		String genPassword="";
		
		switch(choice)

		{ 
		case 1: empImpl.generateEmailID(firstName, lastName, "tech"); break;
		

		case 2: empImpl.generateEmailID(firstName, lastName, "admin"); break;
		
		case 3: empImpl.generateEmailID(firstName, lastName, "hr"); break;

		case 4: empImpl.generateEmailID(firstName, lastName, "lega;"); break;
		
		default: System.out.println("Please enter valid input");
		}
		
		 genPassword=empImpl.generatePassword();
		 
		 Employee e1=new Employee();
		 e1.setFirstname(firstName);
		 e1.setLastname(lastName);
		 e1.setEmail(genEmail);
		 e1.setPassword(genPassword);
		 
		 empImpl.showEmployeeDetails(e1);
		 sc.close();
		

	}

}

