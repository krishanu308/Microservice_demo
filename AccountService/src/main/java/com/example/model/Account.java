package com.example.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "account")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long accountId;
	
	@Column(name="account_Type")
	private String accountType;
	
	@Column(name="customer_Id")
	private String customerId;
	
	@Column(name="customer_Id")
	private String customerName;
	
	@Column(name="branch")
	private String branch;
	
	@Column(length = 1)
	private String minorIndicator;
	
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern="dd-MM-yyyy")
	private Date openDate;
	
	public Account(){
		
	}
	
	public Account(int accountId, String accountType, String customerId, String customerName, String branch,
			String minorIndicator) {
		super();
		this.accountType = accountType;
		this.customerId = customerId;
		this.customerName = customerName;
		this.branch = branch;
		this.minorIndicator = minorIndicator;
	}


	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getMinorIndicator() {
		return minorIndicator;
	}

	public void setMinorIndicator(String minorIndicator) {
		this.minorIndicator = minorIndicator;
	}
	
}
