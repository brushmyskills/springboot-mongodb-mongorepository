package com.brushmyskills.mongodb.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.brushmyskills.mongodb.model.Employee;

//No need implementation, just one interface, and you have all CRUD operations for Employee
public interface EmployeeRepository extends MongoRepository<Employee, Integer> {

	
	Employee findById(Integer id);
	
	List<Employee> findByName(String name);

}
