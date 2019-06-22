package com.example.demo;

import java.io.*;
import java.util.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.JavaProject.SviluppoDati.*;


@SpringBootApplication
public class ProjectFarmaciaApplication {

	public static void main(java.lang.String[] args) {
		SpringApplication.run(ProjectFarmaciaApplication.class, args);
		Importa_Dati.main(args);
	}
	

}

