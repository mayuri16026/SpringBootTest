package com.bajaj.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bajaj.entity.EmployeeEntity;

public interface EmployeeDao extends JpaRepository<EmployeeEntity,Integer>
{

}
