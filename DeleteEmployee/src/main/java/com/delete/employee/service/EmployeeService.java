package com.delete.employee.service;

import com.delete.employee.exceptions.IdNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.delete.employee.dao.EmployeeRepository;

@Service
public class EmployeeService implements EmployeeServiceI {

	
	@Autowired
	private EmployeeRepository dao;
	@Override
	public String deleteEmployee(Integer empId) {
		// TODO Auto-generated method stub
		 dao.delete(empId);
		 return "Deleted Successfully";
	}

}