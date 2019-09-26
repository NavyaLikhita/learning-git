package com.cg.employeemanagement.dao;

import java.util.List;

import com.cg.employeemanagement.dto.Employee;

public interface EmployeeDao {

	public Employee save(Employee emp);
	public List<Employee> show();
	public void remove(Integer empId);

	
}
