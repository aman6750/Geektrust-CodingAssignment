package com.employe.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employe.exception.ResourceNotFoundException;
import com.employe.model.Employee;
import com.employe.repository.EmployeeRepository;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepo;
	
	// get all employees
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){		
		return empRepo.findAll();		
	}
	
	@PostMapping("/employees")
	public Employee createEmployee(@RequestBody Employee employee) {
		return empRepo.save(employee);
	}
	
	// get employee by id
	@GetMapping("/employees/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){
		
		Employee employee=empRepo.findById(id)
		.orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:"+id));
		
		return new ResponseEntity<Employee>(employee,HttpStatus.OK);
	}
	
	@PutMapping("/employees/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable Long id ,@RequestBody Employee employee){
		
		Employee oldemployee=empRepo.findById(id)
				.orElseThrow(()-> new ResourceNotFoundException("Employee not exist with id:"+id));
		
		
		oldemployee.setEmailId(employee.getEmailId());
		oldemployee.setFirstname(employee.getFirstname());
		oldemployee.setLastname(employee.getLastname());
		
		Employee updatedEmployee =empRepo.save(oldemployee);
		
		return new ResponseEntity<Employee>(updatedEmployee,HttpStatus.ACCEPTED);
		
	}
	
	
	
	
	
	
}
