package com.example.customer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/customer")
public class CustomerController {
	@Autowired
	CustomerService service;
	
	@GetMapping("/all")
	public List<Customer> getallmoviedata(){
		return service.getAllCustomer();
	}
	
	@PostMapping("/save")
	public Customer insertcustomer(@RequestBody Customer customer) {
		return service.insert(customer);
	}
	
	@GetMapping("admin/search/{movie_id}")
	public Optional<AdminDto> searchMovie(@PathVariable("movie_id") int movie_id) {
		return service.searchByid(movie_id);
	}
}
