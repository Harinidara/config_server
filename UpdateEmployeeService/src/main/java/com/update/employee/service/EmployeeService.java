package com.update.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.update.employee.entity.Employee;
import com.update.employee.dao.EmployeeRepository;


@Service
@Transactional
public class EmployeeService implements EmployeeServiceI {

	
	@Autowired
	private EmployeeRepository dao;
	

	@Override
	public String updateEmployee(Employee employee) {
		boolean result=dao.exists(employee.getEmployeeID());
		if(result)
		{
			dao.save(employee);
			return "Updated Successfully";
		}else
		{
			dao.save(employee);
			return "Update not possible user added ";
		}
	}
}