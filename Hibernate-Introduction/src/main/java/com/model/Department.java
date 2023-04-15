package com.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class Department {

	@Id
	@Column
	private String name;

	@Column(name = "min_salary")
	private BigDecimal minSalary;

	@Column(name = "max_salary")
	private BigDecimal maxSalary;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "department",
			fetch = FetchType.LAZY) //default value
	private List<Employee> listEmployee;

	public Department() {
	}

	public Department(String name, BigDecimal minSalary, BigDecimal maxSalary) {
		this.name = name;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}

	public void addEmployee(Employee employee) {
		if (listEmployee == null) {
			listEmployee = new ArrayList<>();
		}
		listEmployee.add(employee);
		employee.setDepartment(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getMinSalary() {
		return minSalary;
	}

	public void setMinSalary(BigDecimal minSalary) {
		this.minSalary = minSalary;
	}

	public BigDecimal getMaxSalary() {
		return maxSalary;
	}

	public void setMaxSalary(BigDecimal maxSalary) {
		this.maxSalary = maxSalary;
	}

	@Override
	public String toString() {
		return "Department [name=" + name + ", minSalary=" + minSalary + ", maxSalary=" + maxSalary + "]";
	}

}
