package com.example.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.vo.AccountBean;

@FeignClient(name="netflix-zuul-api-gateway-server")
@RibbonClient(name="customer-service")
public interface CustomerServiceProxy {
	
	
	@GetMapping("customer-service/customers/{id}")
	public AccountBean getCustomerById(@PathVariable String id);

}
