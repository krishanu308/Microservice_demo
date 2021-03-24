package com.example;

import com.example.model.User;

public class Customer {
	
	private User user;

	private String customerName;
	
	private String customerDob;
	
	private String gender;
	
	private String phone;
	
	private String roleName;
	
	private String roleCode;
	
	public Customer() {
		
	}
	
	public Customer(String customerName, String customerDob, String gender, String phone) {
		super();
		this.customerName = customerName;
		this.customerDob = customerDob;
		this.gender = gender;
		this.phone = phone;
	}
	

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerDob() {
		return customerDob;
	}

	public void setCustomerDob(String customerDob) {
		this.customerDob = customerDob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleCode() {
		return roleCode;
	}

	public void setRoleCode(String roleCode) {
		this.roleCode = roleCode;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
}
