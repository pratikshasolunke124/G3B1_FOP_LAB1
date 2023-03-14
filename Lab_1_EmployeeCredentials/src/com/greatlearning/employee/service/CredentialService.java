package com.greatlearning.employee.service;

import com.greatlearning.employee.model.Employee;

public interface CredentialService {
	
	public String generatePassword();

	public String generateEmailId(Employee employee);

	public String showCredentials(Employee employee);
}
