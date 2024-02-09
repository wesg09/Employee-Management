package com.developer.employeemanagement.service;

import java.util.List;
import java.util.Optional;

import com.developer.employeemanagement.entity.EmployeeEntity;

public interface EmployeeService {

	List<EmployeeEntity> findAllEmployee();

	Optional<EmployeeEntity> findById(Long id);

	EmployeeEntity saveEmployee(EmployeeEntity employee);

	EmployeeEntity updateEmployee(EmployeeEntity employee);

	void deleteEmployee(Long id);

}
