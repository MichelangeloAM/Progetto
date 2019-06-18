package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectFarmaciaApplication {

	public static void main(java.lang.String[] args) {
		SpringApplication.run(ProjectFarmaciaApplication.class, args);
		Partita_Iva partita = new Partita_Iva();
	}
	

}

