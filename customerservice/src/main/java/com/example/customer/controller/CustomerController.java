package com.example.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.customer.model.AdminDto;
import com.example.customer.model.Customer;
import com.example.customer.service.CustomerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> getallmoviedata(){
		return service.getAllCustomer();
	}
	
	@PostMapping("/save")
	public String insertcustomer(@RequestBody Customer customer) {
		return service.insert(customer);
	}
	@PostMapping("/update")
	public Customer update(@RequestBody Customer customer) {
		return service.update(customer);
	}
	
	@GetMapping("admin/search/{rating}")
	public Optional<AdminDto> searchMovie(@PathVariable("rating") int rating) {
		return service.searchByrating(rating);
	}
}
