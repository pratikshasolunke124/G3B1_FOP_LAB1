package com.greatlearning.employee.service;

import java.util.Random;

import com.greatlearning.employee.model.Employee;

public class CredentialServiceImplement implements CredentialService {
	private static final String COMPANY_DOMAIN = ".infotech.com";
	private static final int PASSWORD_SIZE = 8;

	@Override
	public String generatePassword() {

		String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String splCharacters = "!@#$%^&*()-_[]}{|<>?/";

		String finalPassword = alphabets + numbers + splCharacters;

		String password = "";

		Random random = new Random();

		for (int i = 0; i < PASSWORD_SIZE; i++) {
			password = password + finalPassword.charAt(random.nextInt(finalPassword.length()));
		}
		return password;
	}

	@Override
	public String generateEmailId(Employee employee) {
		String firstName = employee.getFirstName();
		String lastName = employee.getLastName();
		String department = employee.getDepartment();
		
		return firstName + lastName + "@" + department + COMPANY_DOMAIN;
	}

	@Override
	public String showCredentials(Employee employee) {
		System.out.println("Dear " + employee.getFirstName() + " "
				+ "your generated credentials are as follows ");
		System.out.println("Email ---> " + employee.getEmailId());
		System.out.println("Password ---> " + employee.getPassword());
		return null;
	}

}
