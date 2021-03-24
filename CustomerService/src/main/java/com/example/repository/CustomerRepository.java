package com.example.repository;

import java.util.Date;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer;
import com.example.model.User;

public interface CustomerRepository extends JpaRepository<User, Long>{
	
	default Customer saveCustomerRoleData(Customer cust) {
		User user = new User(cust.getCustomerName(),new Date(cust.getCustomerDob()),
								cust.getGender(),cust.getPhone());
		user.getRole().setRoleCode(cust.getRoleCode());
		user.getRole().setRoleName(cust.getRoleName());
		cust.setUser(user);
		return cust;
		
	}

}
