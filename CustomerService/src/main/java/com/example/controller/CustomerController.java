package com.example.controller;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import com.example.Customer;
import com.example.model.Role;
import com.example.model.User;
import com.example.repository.CustomerRepository;
import com.example.repository.RoleRepository;
import com.example.repository.UserRepository;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import reactor.core.publisher.Mono;


@RestController
public class CustomerController {
	
	private static SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
	
	@Autowired
	private  WebClient.Builder webClientBuilder;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private CustomerRepository custRepository;
	
	@GetMapping("customer-service/customers")
	public List<Customer> getAllCustomers() {
		List<User> userList = userRepository.findAll();
		List<Customer> custList = new ArrayList<Customer>();
		
		for(User user:userList) {
			custList.add(new Customer(user.getUserName(),
					df.format(user.getDateOfBirth()), user.getGender(),
					user.getPhone()));
		}
		
		return custList;
	}
	
	@GetMapping("customer-service/customers/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		Optional<User> user = userRepository.findById(id);
		return new Customer(user.get().getUserName(),df.format(user.get().getDateOfBirth()),
				user.get().getGender(),user.get().getPhone());
	}
	
	public Mono<User> findById(Long id) 
	{
	    return webClientBuilder.build()
	    	.get()
	        .uri("customer-service/customers/" + id)
	        .retrieve()
	        .bodyToMono(User.class);
	}
	
	@PostMapping("/customer-service/users") 
	public EntityModel<Customer> createUserData(@RequestBody Customer customer) throws Exception{
		
		Customer custData = custRepository.saveCustomerRoleData(customer);
		EntityModel<Customer> resource = EntityModel.of(custData);
		WebMvcLinkBuilder linkTo = WebMvcLinkBuilder.
				linkTo(methodOn(this.getClass()).getAllCustomers());
		
		resource.add(linkTo.withRel("all-customers"));

		return resource;
	}

}
