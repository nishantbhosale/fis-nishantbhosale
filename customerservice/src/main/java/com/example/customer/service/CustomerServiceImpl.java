package com.example.customer.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.AdminDto;
import com.example.customer.model.Customer;
import com.example.customer.repo.CustomerRepository;
@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	CustomerRepository repo;
	@Autowired
	FeignProxy proxy;
	@Override
	public List<Customer> getAllCustomer() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String insert(Customer customer) {
		// TODO Auto-generated method stub
		repo.save(customer);
		return "Customer is Registered Successfully!";
	}

	@Override
	public Optional<AdminDto> searchByrating(int rating) {
		// TODO Auto-generated method stub
		return proxy.searchMovie(rating);
	}

	@Override
	public Customer update(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}

}
