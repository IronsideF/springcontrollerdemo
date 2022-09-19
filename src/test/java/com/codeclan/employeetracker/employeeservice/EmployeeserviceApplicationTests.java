package com.codeclan.employeetracker.employeeservice;

import com.codeclan.employeetracker.employeeservice.models.Employee;
import com.codeclan.employeetracker.employeeservice.repositories.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmployeeserviceApplicationTests {
	@Autowired
	EmployeeRepository employeeRepository;


	@Test
	void contextLoads() {
	}
	@Test
	public void createEmployee(){
		Employee myEmployee = new Employee("Keith", 39, 10, "keithrocks@codeclan.com");
		employeeRepository.save(myEmployee);
	}

}
