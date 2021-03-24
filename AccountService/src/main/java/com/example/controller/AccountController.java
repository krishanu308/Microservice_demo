package com.example.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Account;
import com.example.proxy.CustomerServiceProxy;
import com.example.vo.AccountBean;


@RestController
public class AccountController {
	
	@Autowired
	private CustomerServiceProxy proxy;
	
	
	@GetMapping("account-service/accounts")
	public AccountBean getAccounts(@RequestBody Account account) {
		
		//Approach: Using feign to invoke the another rest service
		AccountBean accountBean = proxy.getCustomerById(account.getCustomerId());
		System.out.println("Detailed response::"+accountBean);
		return new AccountBean(accountBean.getUserName(),accountBean.getDateOfBirth(),
				accountBean.getGender(),accountBean.getPhone(),accountBean.getAccountType()
				,accountBean.getBranchName(),accountBean.getOpendate(),accountBean.getUserId());
	
	}

}
