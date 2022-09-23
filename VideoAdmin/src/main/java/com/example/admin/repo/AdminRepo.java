package com.example.admin.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.admin.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{
   
	
}
