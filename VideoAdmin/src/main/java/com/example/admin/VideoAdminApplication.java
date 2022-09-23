package com.example.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.admin" )
@EnableEurekaClient
public class VideoAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideoAdminApplication.class, args);
	}

}