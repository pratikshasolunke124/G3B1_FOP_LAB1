package com.greatlearning.employee.main;

import java.util.Scanner;

import com.greatlearning.employee.model.Employee;
import com.greatlearning.employee.service.CredentialServiceImplement;

public class Driver {

	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			CredentialServiceImplement service = new CredentialServiceImplement();
			
			Employee emp = new Employee("diksha", "nehra");
			
			System.out.println("Please enter the department from the following");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			int choice = sc.nextInt();

			String department = null;
			switch (choice) {
			case 1:
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;
			case 3:
				department = "hr";
				break;
			case 4:
				department = "legal";
				break;

			default:
				System.out.println("Please enter valid choice");
			}
			
			if (department != null) {
				emp.setDepartment(department);
				
			String emailId= service.generateEmailId(emp);
			emp.setEmailId(emailId);
			
			String password= service.generatePassword();
			emp.setPassword(password);
			
			service.showCredentials(emp);
			
			
			 }
		}	
	}

}
