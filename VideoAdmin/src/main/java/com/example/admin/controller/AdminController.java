package com.example.admin.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@CrossOrigin("*")
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
	
	@DeleteMapping("/delete/{id}")
	public String deleteMovie(@PathVariable("id")int id) {
		return service.deleteMovieById(id);
	}
	
	@GetMapping("/search/{rating}")
	public Optional<Admin> searchMovie(@PathVariable("rating") int rating) {
		return service.searchByrating(rating);
	}
	
	
	
}

