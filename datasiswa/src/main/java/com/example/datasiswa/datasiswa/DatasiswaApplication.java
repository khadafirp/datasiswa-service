package com.example.datasiswa.datasiswa;

import javax.persistence.Entity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.datasiswa.datasiswa.controller.DataSiswaController;

@SpringBootApplication
//@ComponentScan({"com.example.datasiswa.datasiswa.service"})
//@EntityScan("com.example.datasiswa.datasiswa.entity")
//@EnableJpaRepositories("com.example.datasiswa.datasiswa.repository")
public class DatasiswaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatasiswaApplication.class, args);
//		System.out.println("Hello World");
	}
}
