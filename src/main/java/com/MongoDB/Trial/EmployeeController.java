package com.MongoDB.Trial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

@Autowired
EmployeeRepository erepo;

@RequestMapping("/mongo")
 
public String hellomongo() {
	return "Hello MongoDB";
}

@RequestMapping("/save")
public String saveEmployee(@RequestBody Employee emp) {
	erepo.save(emp);
	return "Employee saved successfully";
	}

@RequestMapping("/all")
public Iterable<Employee> getAllEmployees() {
	return erepo.findAll();}
}

