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
	public String deleteMovieData(int movie_id) {
		// TODO Auto-generated method stub
		repo.deleteById(movie_id);
		return "A movie record is deleted with " + movie_id + "as its movie id." ;
	}

	@Override
	public Optional<Admin> searchByid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}



}
