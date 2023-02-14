package com.bajaj.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.bajaj.dao.EmployeeDao;
import com.bajaj.entity.EmployeeEntity;



@Service
//it is used at the class level it shows that the annoted class is a service class
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	
	@Override
	public void addemployee( EmployeeEntity employee)
	{
		employeeDao.save(employee);
	}
	public List<EmployeeEntity>displayAll()
	{
		List<EmployeeEntity> list=employeeDao.findAll();
		
		
		return list;
	}
	public  Optional<EmployeeEntity> getEmployee(Integer id)
	{
		return employeeDao.findById(id);
	}
	public void deleteEmployeeById(int id)
	{
		employeeDao.deleteById(id);
	}

}
