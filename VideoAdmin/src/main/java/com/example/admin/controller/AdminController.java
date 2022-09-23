package com.example.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.admin.model.Admin;
import com.example.admin.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService service;
	
	@GetMapping("/display")
	public List<Admin> getallmoviedata(){
		return service.findallMovieData();
	
	}

	@PostMapping("/add")
	public Admin insertmoviedata(@RequestBody Admin model) {
		return service.addMovieData(model);
	}
	
	@DeleteMapping("/delete/{movie_id}")
	public String deletemoviedata(@PathVariable("movie_id") int movie_id) {
		return service.deleteMovieData(movie_id);
	}
	
	@GetMapping("/search/{movie_id}")
	public Optional<Admin> searchMovie(@PathVariable("movie_id") int movie_id) {
		return service.searchByid(movie_id);
	}
	
	
	
}

