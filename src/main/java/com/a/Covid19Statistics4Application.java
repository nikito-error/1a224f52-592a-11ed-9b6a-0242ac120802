package com.a;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.a.domain.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.a.service.UserService;

@SpringBootApplication
public class Covid19Statistics4Application {

	public static void main(String[] args) {
		SpringApplication.run(Covid19Statistics4Application.class, args);
	}
	@Bean
	CommandLineRunner runner(UserService userService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<User> typeReference = new TypeReference<User>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/summary.json");
			try {
				User users = mapper.readValue(inputStream,typeReference);
				userService.save(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
	    };
	}
}

