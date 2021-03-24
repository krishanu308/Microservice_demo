package com.example.vo;

public class AccountBean {
	
	private String userName;
	
	private String dateOfBirth;
	
	private String gender;
	
	private String phone;
	
	private String accountType;
	
	private String branchName;
	
	private String opendate;
	
	private String userId;
	
	public AccountBean() {
		
	}

	public AccountBean(String customerName, String customerDob, String customerGender, String customerPhone,
			String accountType, String branchName, String opendate, String customerId) {
		super();
		this.userName = customerName;
		this.dateOfBirth = customerDob;
		this.gender = customerGender;
		this.phone = customerPhone;
		this.accountType = accountType;
		this.branchName = branchName;
		this.opendate = opendate;
		this.userId = customerId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
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

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public String getOpendate() {
		return opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}

	
}
