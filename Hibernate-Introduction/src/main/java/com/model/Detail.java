package com.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Detail {

	public Detail() {
	}

	public Detail(String city, String phone, String email) {
		this.city = city;
		this.phone = phone;
		this.email = email;
	}

	@Id
	@GeneratedValue
	@Column
	private long id;

	@Column
	private String city;

	@Column
	private String phone;

	@Column
	private String email;

	@OneToOne(mappedBy = "detailId")//, cascade = { CascadeType.PERSIST, CascadeType.REFRESH })
	private Employee employeeId;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Detail [id=" + id + ", city=" + city + ", phone=" + phone + ", email=" + email + "]";
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

}
