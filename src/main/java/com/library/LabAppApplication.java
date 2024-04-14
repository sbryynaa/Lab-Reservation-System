
package com.library;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

// The program might get Beans confused, so we...
// annotate @EntityScan and @EnableJpaRepositories
// Ensure entities scanned in package 'com.library'
@EntityScan(basePackages = "com.library")

// Ensure scanning of Spring Data repositories in package "com.library"
@EnableJpaRepositories("com.library")

// Annotate as SpringBootApplication
@SpringBootApplication
public class LabAppApplication {

	// Run the Spring application!
	public static void main(String[] args) {
		SpringApplication.run(LabAppApplication.class, args);
	}

}
