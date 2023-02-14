package com.bajaj.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bajaj.entity.EmployeeEntity;

import com.bajaj.service.EmployeeServiceImpl;

@RestController
@RequestMapping(path = "/emp")
public class EmployeeController {

	@Autowired
	private EmployeeServiceImpl employeeService;

	@PostMapping("/employee/add")
	public ResponseEntity addEmployee(@RequestBody EmployeeEntity employee) {
		 employeeService.addemployee(employee);
		return new ResponseEntity(HttpStatus.OK);
	}

	@RequestMapping(value = "/employees")
	public List<EmployeeEntity> displayAll() {

		List<EmployeeEntity> list = employeeService.displayAll();

		return list;

	}

	@RequestMapping(value = "/employee/{eid}", method = RequestMethod.GET)
	public ResponseEntity getEmployee(@PathVariable("eid") int id) {
		
		ResponseEntity responseEntity = new ResponseEntity(employeeService.getEmployee(id),HttpStatus.OK);
		return  responseEntity;
	}

	@DeleteMapping("/employee/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployeeById(id);
	}
	
	
	@PostMapping("/employee/update")
	public ResponseEntity addUpdate(@RequestBody EmployeeEntity employee) {
		 employeeService.addemployee(employee);
		return new ResponseEntity(HttpStatus.OK);
	}

}