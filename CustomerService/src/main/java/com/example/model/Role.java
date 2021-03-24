package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "role")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String roleId;
	
	@Column(name = "role_name")
	private String roleName;
	
	@Column(name="role_code")
	private String roleCode;
	
	@OneToOne(fetch = FetchType.LAZY,
			optional= false)
	@JoinColumn(name="userId", nullable = false)
	private User customer;
	
	public Role() {
		
	}

	public Role(String roleId, String roleName, String roleCode) {
		super();
		this.roleName = roleName;
		this.roleCode = roleCode;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
	
}
