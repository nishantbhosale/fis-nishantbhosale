package com.example.admin.service;

import java.util.List;
import java.util.Optional;

import com.example.admin.model.Admin;

public interface AdminService {

	public List<Admin> findallMovieData();
	public Admin addMovieData(Admin model);
	public String deleteMovieById(int id);
	public Optional<Admin> searchByrating(int rating);
}
