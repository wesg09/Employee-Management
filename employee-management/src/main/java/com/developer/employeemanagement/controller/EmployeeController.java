package com.developer.employeemanagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	private final EmployeeService empser;

	public EmployeeController(EmployeeService empser) {
		this.empser = empser;
	}

	@GetMapping
	public List<EmployeeEntity> findAllEmployee() {
		return empser.findAllEmployee();
	}

	@GetMapping("/{id}")
	public Optional<EmployeeEntity> findEmployeeById(@PathVariable("id") Long id) {
		return empser.findById(id);
	}

	@PostMapping
	public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return empser.saveEmployee(employeeEntity);
	}

	@PutMapping
	public EmployeeEntity updateEmployee(@RequestBody EmployeeEntity employeeEntity) {
		return empser.updateEmployee(employeeEntity);
	}

	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		empser.deleteEmployee(id);
	}

}
