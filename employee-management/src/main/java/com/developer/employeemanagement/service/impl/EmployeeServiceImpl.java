package com.developer.employeemanagement.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.repository.EmployeeRepo;
import com.developer.employeemanagement.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final EmployeeRepo empRepo;

	public EmployeeServiceImpl(EmployeeRepo empRepo) {
		this.empRepo = empRepo;
	}

	@Override
	public List<EmployeeEntity> findAllEmployee() {
		return empRepo.findAll();
	}

	@Override
	public Optional<EmployeeEntity> findById(Long id) {
		return empRepo.findById(id);

	}

	@Override
	public EmployeeEntity saveEmployee(EmployeeEntity employee) {
		return empRepo.save(employee);
	}

	@Override
	public EmployeeEntity updateEmployee(EmployeeEntity employee) {
		return empRepo.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		empRepo.deleteById(id);

	}

}
