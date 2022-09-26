package com.example.customer.service;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.customer.model.AdminDto;



@FeignClient(name="videoadmin")
public interface FeignProxy {
	@GetMapping("admin/search/{rating}")
	public Optional<AdminDto> searchMovie(@PathVariable("rating") int rating);
}
