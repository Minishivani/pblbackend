package com.springboot.pbl;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class PblbackendApplication {

	public static HashMap<String,String> codes = new HashMap<>();

	public static void main(String[] args) {
		SpringApplication.run(PblbackendApplication.class, args);
	}

}
