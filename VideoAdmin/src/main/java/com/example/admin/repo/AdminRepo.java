package com.example.admin.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.admin.model.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer>{
	@Query("select s from Admin s where s.rating=?1 ")
	public Optional<Admin> searchByrating(int raing);
	
}
