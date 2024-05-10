package com.example.pfmdemo;

import com.example.pfmdemo.repo.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class PfmdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PfmdemoApplication.class, args);
	}

}
