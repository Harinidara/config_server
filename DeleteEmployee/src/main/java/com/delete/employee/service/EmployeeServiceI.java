package com.delete.employee.service;

import com.delete.employee.exceptions.IdNotFoundException;

public interface EmployeeServiceI {

	String deleteEmployee(Integer empId) throws IdNotFoundException;

}
