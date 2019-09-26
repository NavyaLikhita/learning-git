package com.cg.employeemanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cg.employeemanagement.dto.Employee;
import com.cg.employeemanagement.service.EmployeeService;




@Controller
public class EmployeeController {
	@Autowired
	EmployeeService empservice;
	
	@RequestMapping(value="/homepage",method=RequestMethod.GET)
	public String homePage() {
		return "home";
			}
	@RequestMapping(value="/addpage",method=RequestMethod.GET)
	public String addEmployee(@ModelAttribute("myemp") Employee emp) {
		return "AddEmployee";
	
}
	@RequestMapping(value="/pagesubmit",method=RequestMethod.POST)
	public String addData(@ModelAttribute("myemp") Employee emp ) {
		empservice.addEmployee(emp);
		return "home";
	}
	@RequestMapping(value="/showall",method=RequestMethod.GET)
	public ModelAndView getAllData() {
		List<Employee> myList=empservice.findAll();
		return new ModelAndView("ShowEmployee", "data", myList);	
	
	}
	@RequestMapping()
	public String removeData() {
		
		return"DeleteEmployee";
		
	}
	
	
	
	
}