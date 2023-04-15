package com.model;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	@Column
	private String name;
	@Column
	private String surname;
	@ManyToOne(fetch = FetchType.EAGER) //default value
	@JoinColumn(name = "department")
	private Department department;
	@Column
	private BigDecimal salary;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "detail_id")
	private Detail detailId;

	public Employee() {
	}

	public Employee(String name, String surname, BigDecimal salary) {
		this.name = name;
		this.surname = surname;
		this.salary = salary;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public Detail getDetailId() {
		return detailId;
	}

	public void setDetailId(Detail detailId) {
		this.detailId = detailId;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + ", department=" + department
				+ ", salary=" + salary + ", detailId=" + detailId + "]";
	}
}
