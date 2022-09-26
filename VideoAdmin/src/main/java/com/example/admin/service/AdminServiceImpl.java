package com.example.admin.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.admin.model.Admin;
import com.example.admin.repo.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminRepo repo;
	
	
	@Override
	public List<Admin> findallMovieData() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Admin addMovieData(Admin model) {
		// TODO Auto-generated method stub
		return repo.save(model);
	}

	
	@Override
	public Optional<Admin> searchByrating(int rating) {
		// TODO Auto-generated method stub
		return repo.searchByrating(rating);
	}

	@Override
	public String deleteMovieById(int id) {
		// TODO Auto-generated method stub
		 repo.deleteById(id);
		 return "Deleted !";
	}



}
