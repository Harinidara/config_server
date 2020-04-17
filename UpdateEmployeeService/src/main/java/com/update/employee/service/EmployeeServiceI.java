package com.update.employee.service;

import com.update.employee.entity.Employee;
import com.update.employee.exceptions.IdNotFoundException;

public interface EmployeeServiceI {

	String updateEmployee(Employee employee) throws IdNotFoundException;

}
