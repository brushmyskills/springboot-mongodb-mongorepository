package com.brushmyskills.mongodb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.brushmyskills.mongodb.model.Employee;
import com.brushmyskills.mongodb.repository.EmployeeRepository;

@EnableMongoRepositories(basePackageClasses = EmployeeRepository.class)
@Configuration
public class AppMongoDBConfiguration {
	
	@Autowired
    private EmployeeRepository employeeRepository;
	
	
	/*
	 * Inserting Dummy data into MongoDB for our application 
	 */
	@Bean
	CommandLineRunner dataLoader() {
		
		return (args) -> {
				
				employeeRepository.save(new Employee(1,"Shilpa", "shilpashinde@gmail.com","8121212121","Mumbai"));
				employeeRepository.save(new Employee(2,"Heena", "heena@gmail.com","8221212121","Goa"));
				employeeRepository.save(new Employee(3,"Vikash", "vikash@gmail.com","8321212121","Deharadun"));
				employeeRepository.save(new Employee(4,"Hiten", "hiten@gmail.com","8421212121","Ahemdabad"));
				employeeRepository.save(new Employee(5,"Puneesh", "puneesh@gmail.com","8521212121","Delhi"));
				employeeRepository.save(new Employee(6,"Shipla Sharma", "shiplasharma@gmail.com","8621212121","Bengalru"));
				employeeRepository.save(new Employee(7,"Amar Gupta", "amargupta@gmail.com","8721212121","Chennai"));
				employeeRepository.save(new Employee(8,"Amar Singh", "amarsingh@gmail.com","8821212121","Hyderabad"));
				
			};
		
	}

}
