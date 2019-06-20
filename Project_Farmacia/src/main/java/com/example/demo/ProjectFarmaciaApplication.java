package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@SpringBootApplication
public class ProjectFarmaciaApplication {
	
	@RequestMapping("/")
	String home() {
		return "Funziona!";
	}

	public static void main(java.lang.String[] args) {
		SpringApplication.run(ProjectFarmaciaApplication.class, args);
	}
	

}

