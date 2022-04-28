package com.noel.freelec;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class FreelecApplication {

	public static void main(String[] args) {
		SpringApplication.run(FreelecApplication.class, args);
	}

}
