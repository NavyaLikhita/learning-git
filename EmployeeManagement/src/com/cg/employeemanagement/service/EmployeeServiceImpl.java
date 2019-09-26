package com.cg.employeemanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.employeemanagement.dao.EmployeeDao;
import com.cg.employeemanagement.dto.Employee;
@Service("empservice")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDao empdao;
	@Override
	public Employee addEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return empdao.save(emp);
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empdao.show();
	}

	@Override
	public void remove(Integer empId) {
		// TODO Auto-generated method stub
		empdao.remove(empId);
	}

	
	
}
