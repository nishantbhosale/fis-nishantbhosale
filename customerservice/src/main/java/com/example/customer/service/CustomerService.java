package com.example.customer.service;

import java.util.List;
import java.util.Optional;


import com.example.customer.model.AdminDto;
import com.example.customer.model.Customer;

public interface CustomerService {
	public List<Customer> getAllCustomer();
	public Customer insert(Customer customer);
	public Customer update(Customer customer);
	
	public Optional<AdminDto> searchByid(int id);
}
