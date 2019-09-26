package com.cg.employeemanagement.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.employeemanagement.dto.Employee;
@Repository("empdao")
public class EmployeeDaoImpl implements EmployeeDao{

	List<Employee> myList=new ArrayList<Employee>();
	@Override
	public Employee save(Employee emp) {
		// TODO Auto-generated method stub
		myList.add(emp);
		return emp;
	}

	@Override
	public List<Employee> show() {
		// TODO Auto-generated method stub
		return myList;
	}

	@Override
	public void remove(Integer empId) {
		// TODO Auto-generated method stub
		for(Employee employee:myList) {
			
			if(employee.getEmpId()==empId) {
				
				myList.remove(employee);
				break;
			}
			
			
			
		}
		
		
	}

	

}
