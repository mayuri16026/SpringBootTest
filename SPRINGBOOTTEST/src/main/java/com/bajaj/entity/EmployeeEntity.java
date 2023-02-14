package com.bajaj.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
//
@Table(name="employeetable")
public class EmployeeEntity {
	@Id
	@Column(name="id")
	private String name;
	@Column(name="salary")
	private int salary;
	@Column(name="dept")
	private int deptId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public EmployeeEntity(String name, int salary, int deptId) {
		super();
		this.name = name;
		this.salary = salary;
		this.deptId = deptId;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [name=" + name + ", salary=" + salary + ", deptId=" + deptId + "]";
	}
	
	

}
