package com.brushmyskills.mongodb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brushmyskills.mongodb.model.Employee;
import com.brushmyskills.mongodb.repository.EmployeeRepository;


@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/employees")
	public ResponseEntity<List<Employee>> getAllEmployee() {
		
		List<Employee> emplList = employeeRepository.findAll();

		return new ResponseEntity<List<Employee>>(emplList, HttpStatus.OK);

	}

	@GetMapping("/employees/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer empId) {

		Employee employee = employeeRepository.findById(empId);

		return new ResponseEntity<Employee>(employee, HttpStatus.OK);

	}
	

	@GetMapping("/employees/{empName}/employeeDetailsByName")
	public ResponseEntity<List<Employee>> getEmployeeByName(@PathVariable String empName) {

		List<Employee> empList = employeeRepository.findByName(empName);

		return new ResponseEntity<List<Employee>>(empList, HttpStatus.OK);

	}

}