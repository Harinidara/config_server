package com.fetch.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fetch.employee.entity.Employee;
import com.fetch.employee.dao.EmployeeRepository;
@Service
public class EmployeeService implements EmployeeServiceI{

	@Autowired
	EmployeeRepository dao;
	@Override
	public List<Employee> fetchAllEmployees() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}