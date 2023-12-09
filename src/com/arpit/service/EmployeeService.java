package com.arpit.service;

import com.arpit.model.Employee;

public interface EmployeeService {

	

	String generateEmailID(String fname,String lname,String deptName);
	
	
	
	
	String generatePassword();
	
	
	
	
	
	
	
	
	
	void showEmployeeDetails(Employee e);
}
