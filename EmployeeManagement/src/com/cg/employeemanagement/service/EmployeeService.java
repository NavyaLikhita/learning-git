package com.cg.employeemanagement.service;

import java.util.List;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeService {

	
	public Employee addEmployee(Employee emp);
	public List<Employee> findAll();
	public void remove(Integer empId);
	
}
