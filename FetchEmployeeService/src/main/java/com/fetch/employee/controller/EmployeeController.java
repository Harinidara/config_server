package com.fetch.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fetch.employee.entity.Employee;
import com.fetch.employee.service.EmployeeServiceI;

@RestController
@RequestMapping("/FetchAll_employees")
@CrossOrigin("http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeServiceI service;
	@GetMapping("/fetch")
	public List<Employee> fetchAllEmployees() {
		return service.fetchAllEmployees();
	}
	
}